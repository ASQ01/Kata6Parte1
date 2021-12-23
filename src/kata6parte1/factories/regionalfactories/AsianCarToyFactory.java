package kata6parte1.factories.regionalfactories;

import kata6parte1.factories.ToyFactory;
import kata6parte1.products.models.AsianCarToy;
import kata6parte1.toyproduct.Toy;

public class AsianCarToyFactory extends ToyFactory {

    @Override
    public Toy createToy(int number) {
        return new AsianCarToy(number);
    }
}
