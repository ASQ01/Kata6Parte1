package kata6parte1.products.models;

import kata6parte1.toyproduct.Toy;

public class AsianHelicopterToy implements Toy{
    private final int serialNumber;
    private final String type = "Asian Helicopter";
    
    public AsianHelicopterToy(int serial){
        this.serialNumber = serial;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing '%s' '%d'\n", this.type, this.serialNumber);
    }
    
    @Override
    public void label(){
        System.out.printf("Labelling '%s' '%d'\n", this.type, this.serialNumber);
    }
    
    public int getSerialNumber(){
        return this.serialNumber;
    }
    
    public String getType(){
        return this.type;
    }
}
