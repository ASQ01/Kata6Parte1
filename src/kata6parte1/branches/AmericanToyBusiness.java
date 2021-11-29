package kata6parte1.branches;

import kata6parte1.business.*;
import kata6parte1.products.models.AmericanCarToy;
import kata6parte1.products.models.AmericanHelicopterToy;
import kata6parte1.toyproduct.Toy;

public class AmericanToyBusiness extends ToyBusiness{
    @Override
    public Toy createToy(String type) {
        switch(type.toUpperCase()){
            case "CAR":
                AmericanCarToy car = new AmericanCarToy(serial.next());
                car.pack();
                car.label();
                return car;
            case "HELICOPTER":
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(serial.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;
        }
    }
}
