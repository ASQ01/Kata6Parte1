package kata6parte1.main;
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
            switch(choice.toUpperCase()){
                case "CAR":
                    Car car = business.createCar();
                    break;
                    
                case "HELICOPTER":
                    Helicopter helicopter = business.createHelicopter();
                    break;
                    
                case "EXIT":
                    System.out.println("Goodbye");
                    break;
                    
                default:
                    System.out.println("Not recognizeable toy");
                    break;
            }
        }
        System.exit(0);
    }
}
