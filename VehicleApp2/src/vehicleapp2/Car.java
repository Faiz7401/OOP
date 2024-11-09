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
public class Car {
    //Data member
    String model;
    float cc;
    
    public Car(){
        model = "Myvi";
        cc = 1500;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public float getLiters()
    {
        float liters;
        
        liters=cc/1000;
        
        return liters;
    }
}
    
