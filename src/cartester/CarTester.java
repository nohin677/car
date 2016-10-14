/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

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
        
        System.out.println(car1.ToString() + "-----------");
        
        System.out.println(car2.ToString() + "-----------");
        
        System.out.println(car3.ToString() + "-----------");
    }
        
}
