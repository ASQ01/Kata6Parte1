package kata6parte1.factories;

import kata6parte1.toyproduct.Toy;


public abstract class ToyFactory {
    
    public Toy produceToy(int number){
        Toy new_toy = createToy(number);
        new_toy.pack();
        new_toy.label();
        return new_toy;
    }
    
    protected abstract Toy createToy(int number);
}
