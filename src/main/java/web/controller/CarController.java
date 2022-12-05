package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {


    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getSomeCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("listCar",
                (count == null || count >= 5) ? carService.getListCar() : carService.getSomeCar(carService.getListCar(), count));
        return "cars";
    }
}