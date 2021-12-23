package kata6parte1.factories;

import kata6parte1.toyproduct.Toy;


public abstract class ToyFactory {
    final protected SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Toy produceToy(String type){
        Toy new_toy = createToy(type);
        if (new_toy == null){return null;}
        new_toy.pack();
        new_toy.label();
        return new_toy;
    }
    
    protected abstract Toy createToy(String type);
}
