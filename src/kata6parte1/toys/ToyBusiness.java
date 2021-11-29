package kata6parte1.toys;

import kata6parte1.models.*;
import kata6parte1.toyproduct.Toy;

public class ToyBusiness {
    private final SerialNumberGenerator serial = new SerialNumberGenerator();
    
    public Toy createToy(String type){
        switch(type.toUpperCase()){
            case "CAR":
                CarToy car = new CarToy(serial.next());
                car.pack();
                car.label();
                return car;
            case "HELICOPTER":
                HelicopterToy helicopter = new HelicopterToy(serial.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;
        }
    }
}
