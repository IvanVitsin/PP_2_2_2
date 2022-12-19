package web.service;
import org.springframework.stereotype.Service;
import web.model.CarModel;
import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    List<CarModel> carModelList = new ArrayList<>();
    {
        carModelList.add(new CarModel("BMW",1993,10900));
        carModelList.add(new CarModel("AUDI",2002,20000));
        carModelList.add(new CarModel("FORD",1988,500));
        carModelList.add(new CarModel("Kia",2005,550));
        carModelList.add(new CarModel("Nissan",2009,600));
    }


    @Override
    public List<CarModel> getCars(Integer num) {
        if (num <= 5) {
            return carModelList.subList(0, num);
        }
        return carModelList;
    }
}
