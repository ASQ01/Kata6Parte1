package kata6parte1.main;
import kata6parte1.business.ToyBusiness;
import kata6parte1.factories.SerialNumberGenerator;
import java.util.Scanner;
import kata6parte1.factories.regionalfactories.*;


public class Main {
    public static void main(String[] args){
        SerialNumberGenerator serial = new SerialNumberGenerator();
        ToyBusiness business = new ToyBusiness(new AsianToyFactory());
        
        Scanner input = new Scanner(System.in);
        String choice = "";
        while (!choice.toUpperCase().equals("EXIT")){
            System.out.print("Toy to create: ");
            choice = input.nextLine();
            business.produceToy(choice);
        }
        System.exit(0);
    }
}
