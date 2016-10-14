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
        Car car1 = new Car();
        Car car2 = new Car("Ferrari", "Enzo");
        Car car3 = new Car("Bugatti", "Veyron", 2700000, 409);
        
        System.out.println("Would you like to hear about a: Bugatti, Ferrari,"
                + "or Lamborghini");
        
        Scanner userCar = new Scanner(System.in);
        String userInput = userCar.nextLine();
        
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
