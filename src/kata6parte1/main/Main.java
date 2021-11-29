package kata6parte1.main;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import kata6parte1.toys.*;

public class Main {
    public static void main(String[] args){
        SerialNumberGenerator serial = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        String choice = "";
        while (!choice.toUpperCase().equals("EXIT")){
            System.out.print("Toy to create: ");
            choice = input.nextLine();
            switch(choice.toUpperCase()){
                case "CAR":
                    Car car = new Car(serial.next());
                    car.pack();
                    car.label();
                    break;
                    
                case "HELICOPTER":
                    Helicopter helicopter = new Helicopter(serial.next());
                    helicopter.pack();
                    helicopter.label();
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
