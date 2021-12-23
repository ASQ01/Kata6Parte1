package kata6parte1.factories.regionalfactories;

import kata6parte1.factories.ToyFactory;
import kata6parte1.products.models.AmericanHelicopterToy;
import kata6parte1.toyproduct.Toy;

public class AmericanHelicopterToyFactory extends ToyFactory {

    @Override
    public Toy createToy(int number) {
        return new AmericanHelicopterToy(number);
    }
    
}
