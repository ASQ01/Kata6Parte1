package kata6parte1.factories.regionalfactories;

import kata6parte1.factories.ToyFactory;
import kata6parte1.products.models.AsianCarToy;
import kata6parte1.products.models.AsianHelicopterToy;
import kata6parte1.toyproduct.Toy;

public class AsianToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type) {
        switch (type.toUpperCase()){
            case "HELICOPTER":
                AsianHelicopterToy helicopter = new AsianHelicopterToy(this.generator.next());
                return helicopter;
            case "CAR":
                AsianCarToy car = new AsianCarToy(this.generator.next());
                return car;
            default:
                return null;
        }
    }
}
