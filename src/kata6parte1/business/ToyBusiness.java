package kata6parte1.business;

import kata6parte1.factories.ToyFactory;
import kata6parte1.toyproduct.Toy;

public class ToyBusiness {
    private final ToyFactory factory;
    
    public ToyBusiness(ToyFactory factory){
        this.factory = factory;
    }
    
    public Toy produceToy(String type){
        return this.factory.produceToy(type);
    }
}
