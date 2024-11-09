/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapp;

/**
 *
 * @author User
 */
public class VehicleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle v = new Vehicle("MPV","Manual","Gasoline");
        
        v.autoAccelerate();
        System.out.println("Accelerate: Current speed = "+v.speed);
        
        v.autoBrake();
        System.out.println("Brake: Current Spped = "+v.speed);
        
        System.out.println(v.powertrain +" "+ v.type + " with " + v.transmission+" transmission");
        System.out.println("************************************************");
        
        v.getRoadTax();
        System.out.println("RoadTax price = RM"+v.price);
    }
    
}
