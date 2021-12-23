package kata6parte1.factories.regionalfactories;

import kata6parte1.factories.ToyFactory;
import kata6parte1.products.models.AsianHelicopterToy;
import kata6parte1.toyproduct.Toy;

public class AsianHelicopterToyFactory extends ToyFactory {

    @Override
    public Toy createToy(int number) {
        return new AsianHelicopterToy(number);
    }
}
