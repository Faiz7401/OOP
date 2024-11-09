/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapp2;

/**
 *
 * @author User
 */
public class VehicleApp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle v = new Vehicle("MPV","Manual","Gasoline");
        
        System.out.println("Accelerate: Current speed = "+v.autoAccelerate(4)+"km/h");
        System.out.println("Brake: Current Spped = "+v.autoBrake(2)+"km/h");
        System.out.println(v.getPowertrain() +" "+ v.getType() + " with " + v.getTransmission()+" transmission\n");
        
        System.out.println("RoadTax price = RM"+v.getRoadTax()+"\n");
        
        Tire t = new Tire(24,23,12,'T');
        System.out.println("SPECIFICATION OF TYRE");
        System.out.println("Diameter of rim = "+t.getRimDiameter()+"mm");
        System.out.println("Width of tire = "+t.getWidth()+"mm");
        System.out.println("Aspect Ratio = "+t.getAspectRatio()+"mm");
        System.out.println("Maximum Speed : "+t.getSpeedRating()+"km/h\n");
        
        Car c = new Car();
        System.out.println("SPECIFICATION OF CAR");
        System.out.println("Model of the car = "+c.getModel());
        System.out.println("Liters = "+c.getLiters()+"L");
    }
    
}

