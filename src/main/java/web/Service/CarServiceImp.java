package web.Service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> request(String count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("amg2.0", 1, "mers"));
        cars.add(new Car("polo", 2, "vw"));
        cars.add(new Car("solarius", 3, "hundui"));
        cars.add(new Car("KAEN", 4, "porche"));
        cars.add(new Car("sinyaa", 5, "boroda"));
        if (count != null) {
            cars = cars.stream().limit(Integer.parseInt(count)).collect(Collectors.toList());
        }
        return cars;
    }
}
