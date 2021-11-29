package kata6parte1.main;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import kata6parte1.toys.*;

public class Main {
    public static void main(String[] args){
        SerialNumberGenerator serial = new SerialNumberGenerator();
        
        Scanner input = new Scanner(System.in);
        String choice = "";
        while (!choice.toUpperCase().equals("EXIT")){
            System.out.print("Toy to create: ");
            choice = input.nextLine();
            if (!choice.toUpperCase().equals("EXIT")){
                Car car = new Car(serial.next());
                car.pack();
                car.label();
            }
        }
        System.exit(0);
    }
}
