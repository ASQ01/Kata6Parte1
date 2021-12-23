package kata6parte1.business;

import java.util.HashMap;
import java.util.Map;
import kata6parte1.factories.SerialNumberGenerator;
import kata6parte1.factories.ToyFactory;
import kata6parte1.toyproduct.Toy;

public class ToyBusiness {
    private final SerialNumberGenerator generator = new SerialNumberGenerator();
    private Map<String, ToyFactory> factories = new HashMap<>();
    
    public void addFactory(String name, ToyFactory factory){
        this.factories.put(name.toUpperCase(), factory);
    }
    
    public Toy produceToy(String type){
        try{
            Toy toy = this.factories.get(type.toUpperCase()).produceToy(generator.next());
            return toy;
        }
        
        catch(Exception e){
            return null;
        }
    }
}
