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
public class Car {
    private String make, model;
    private int price, year, mileage, topSpeed;
/**
 * Sets a "car" without parameters
 * Pre: None
 * Post: defines specifications of car1
 */    
public Car(){
make = "Lamborghini";
model = "Gallardo";
price = 300000;
year = 2016;
mileage = 0;
topSpeed = 325;
}
/**
 * Sets a "car" with two strings as parameters
 * Pre: None
 * Post: defines specifications of car2
 * @param carName
 * @param carModel 
 */
public Car(String carName, String carModel){
make = carName;
model = carModel;
price = 650000;
year = 2016;
mileage = 0;
topSpeed = 351;
}
/**
 * Sets a "car" with 2 strings and 2 ints as parameters
 * Pre: None
 * Post: defines specifications of car3
 * @param carName
 * @param carModel
 * @param carPrice
 * @param carSpeed 
 */
public Car(String carName, String carModel, int carPrice, int carSpeed){
make = carName;
model = carModel;
price = carPrice;
year = 2016;
mileage = 0;
topSpeed = carSpeed;
}
/**
 * Sets the output of the specifications of the cars
 * Pre: None
 * Post: returns 'Output'
 * @return 
 */
public String ToString(){
    
    String Output = "Make: " + make + "\n";
    Output += "Model: " + model + "\n";
    Output += "Price: " + price + "\n";
    Output += "Year: " + year + "\n";
    Output += "Mileage: " + mileage + "\n";
    Output += "Top Speed: " + topSpeed + "\n";
    
    return Output;
}
}
