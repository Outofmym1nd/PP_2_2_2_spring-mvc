package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {


    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getListCar() {
        return carDao.getListCar();
    }

    @Override
    public List<Car> getSomeCar(List<Car> listCar, int limit) {
        return carDao.getSomeCar(listCar, limit);
    }
}
