package kata6parte1.toys;

public class Helicopter {
    private final int serialNumber;
    private final String type = "Helicopter";
    
    public Helicopter(int serial){
        this.serialNumber = serial;
    }
    
    public void pack(){
        System.out.printf("Packing '%s' '%d'\n", this.type, this.serialNumber);
    }
    
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
