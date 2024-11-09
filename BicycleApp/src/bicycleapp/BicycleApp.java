/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycleapp;

/**
 *
 * @author User
 */
public class BicycleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MountainBike m = new MountainBike(20,10,1);
        
        System.out.println("Gear is: "+m.gear);
        System.out.println("Seat height is: "+m.seatHeight+"m");
        System.out.println("Bike speed is: "+m.speed+"km/h");
        
        m.applyBreak(1);
        System.out.println("Bike speed after applying break is "+m.speed+"km/h");
    }
}