/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapp_lab5;

/**
 *
 * @author User
 */
public class VehicleApp_Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Car c = new Car("Mercedes-AMG E 53",3000,"Coupe'","Automatic","Petrol");
        Vehicle c = new Vehicle("Proton X50", "automatic", "Petrol");
        
        System.out.println("Accelerate: Current speed = "+c.autoAccelerate(4)+"km/h");
        System.out.println("Brake: Current Spped = "+c.autoBrake(2)+"km/h");
        System.out.println(c.getPowertrain()+" "+c.getType()+" with "+c.getTransmission()+" transmission\n");
        
        System.out.println("RoadTax price = RM"+c.getRoadTaxPrice()+"\n");
        
        System.out.println("SPECIFICATION OF CAR");
        //System.out.println("Model of the car = "+c.getModel());
        //System.out.println("Liters = "+c.getLiters()+"L");
    }
    
}
