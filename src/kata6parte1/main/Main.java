package kata6parte1.main;
import kata6parte1.models.HelicopterToy;
import kata6parte1.models.CarToy;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import kata6parte1.toys.*;

public class Main {
    public static void main(String[] args){
        SerialNumberGenerator serial = new SerialNumberGenerator();
        ToyBusiness business = new ToyBusiness();
        
        Scanner input = new Scanner(System.in);
        String choice = "";
        while (!choice.toUpperCase().equals("EXIT")){
            System.out.print("Toy to create: ");
            choice = input.nextLine();
            business.createToy(choice);
        }
        System.exit(0);
    }
}
