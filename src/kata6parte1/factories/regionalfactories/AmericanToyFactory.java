package kata6parte1.factories.regionalfactories;

import kata6parte1.factories.ToyFactory;
import kata6parte1.products.models.AmericanCarToy;
import kata6parte1.products.models.AmericanHelicopterToy;
import kata6parte1.toyproduct.Toy;

public class AmericanToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type) {
        switch (type.toUpperCase()){
            case "HELICOPTER":
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(this.generator.next());
                return helicopter;
            case "CAR":
                AmericanCarToy car = new AmericanCarToy(this.generator.next());
                return car;
            default:
                return null;
        }
    }
    
}
