/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;
import java.util.Scanner;
/**
 *
 * @author nohin6777
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //sets the specifications of cars
        Car car1 = new Car();
        Car car2 = new Car("Ferrari", "Enzo");
        Car car3 = new Car("Bugatti", "Veyron", 2700000, 409);
        
        //prompts the user to input a type of car
        System.out.println("Would you like to hear about a: Bugatti, Ferrari,"
                + "or Lamborghini");
        
        //sets the scanner userCar as the option that the user selected
        Scanner userCar = new Scanner(System.in);
        String userInput = userCar.nextLine();
        
        //outputs the information of the car that the user selected
        if(userInput.equalsIgnoreCase("Lamborghini")){
            System.out.println("\n" + car1.ToString() + "-----------"); 
            
        }else if(userInput.equalsIgnoreCase("Ferrari")){
            System.out.println("\n" + car2.ToString() + "-----------");
            
        }else if(userInput.equalsIgnoreCase("Bugatti")){
            System.out.println("\n" + car3.ToString() + "-----------");
            
        }else{
            System.out.println("Please enter either 'Lamborghini' 'Ferrari' or 'Bugatti'");
        }
        
        
        
        
        
        
        
    }
        
}
