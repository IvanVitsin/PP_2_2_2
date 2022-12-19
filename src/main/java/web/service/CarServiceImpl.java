package web.service;
import org.springframework.stereotype.Service;
import web.model.CarModel;
import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    List<CarModel> carModelList = new ArrayList<>();
    {
        carModelList.add(new CarModel("BMW",1993,100900));
        carModelList.add(new CarModel("AUDI",2002,100000));
        carModelList.add(new CarModel("FORD",1988,500));
        carModelList.add(new CarModel("Kia",2005,550));
        carModelList.add(new CarModel("Nissan",2009,600));
    }


    @Override
    public List<CarModel> getCars(Integer num) {
        if (num == null || num < 0 || num > 5) {
            num = 5;
        }
        return carModelList.subList(0, num);
    }
}
