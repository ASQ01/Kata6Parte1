package kata6parte1.toys;

public class SerialNumberGenerator {
    private int serialNumber = 0;
    
    public int next(){
        return this.serialNumber++;
    }
}
