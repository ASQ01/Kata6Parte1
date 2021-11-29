package kata6parte1.branches;

import kata6parte1.business.*;
import kata6parte1.products.models.AsianCarToy;
import kata6parte1.products.models.AsianHelicopterToy;
import kata6parte1.toyproduct.Toy;

public class AsianToyBusiness extends ToyBusiness{
    @Override
    public Toy createToy(String type) {
        switch(type.toUpperCase()){
            case "CAR":
                AsianCarToy car = new AsianCarToy(serial.next());
                car.pack();
                car.label();
                return car;
            case "HELICOPTER":
                AsianHelicopterToy helicopter = new AsianHelicopterToy(serial.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;
        }
    }
}
