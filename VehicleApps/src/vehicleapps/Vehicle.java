/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapps;

/**
 *
 * @author User
 */
public class Vehicle {
    
    //Data member
    String type;
    String transmission;
    String powertrain;
    int speed;
    int price;

    //Constructor: initialize the data memnber
    public Vehicle (String type, String transmission, String powertrain)
    { 
        this.type = type;
        this.transmission = transmission;
        this.powertrain = powertrain;
        speed = 60;
    }
    
    //Return the value in the variable
    public String getType()
    {
        return type;
    }
    
    public String getTransmission()
    {
        return transmission;
    }
    
    public String getPowertrain()
    {
        return powertrain;
    }
    
    public int speed()
    {
        return speed;
    }
    
    public int price()
    {
        return price;
    }
    
    //Assigns the value of variable
    public void setType(String setType)
    {
        type = setType;
    }
    
    public void setTransmission(String setTransmission)
    {
        transmission = setTransmission;
    }
    
    public void setPowertrain(String setPowertrain)
    {
        powertrain = setPowertrain;
    }
    
    //loop statement for auto accelerate
    public void autoAccelerate()
    {
            speed = speed + 10;
    }
    
    //loop statement for auto brake
    public void autoBrake()
    {
            speed = speed - 5;
    }
    
}