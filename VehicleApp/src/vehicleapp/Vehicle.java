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
public class Vehicle {
    
    //Data member
    String type;
    String transmission;
    String powertrain;
    int speed;
    int price;
    int accelerate;
    int brake;

    //Constructor: initialize the data memnber
    public Vehicle (String type, String transmission, String powertrain)
    { 
        this.type = type;
        this.transmission = transmission;
        this.powertrain = powertrain;
        speed = 60;
        accelerate = 4;
        brake = 8;
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
    
    public int accelerate()
    {
        return accelerate;
    }
    
    public int brake()
    {
        return brake;
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
    
    //nested if to get the price of roadtax
    public double getRoadTax()
    {
        int roadTax=0;//local variable
        
        if(type == "Car"){
            if(powertrain == "Gasoline")
                roadTax = 200;
            else if (powertrain == "Hybrid")
                roadTax = 100;
            else if (powertrain == "Electric")
                roadTax = 50;
        }
        else if(type == "SUV" || type == "MPV"){
            if(powertrain == "Gasoline")
                roadTax = 300;
            else if (powertrain == "Hybrid")
                roadTax = 150;
            else if (powertrain == "Electric")
                roadTax = 100;
        }
        else if(type == "Lorry")
            roadTax = 400;
        else
            roadTax=0;
        
        return roadTax;
    }
    
    //loop statement for auto accelerate
    public void autoAccelerate()
    {
        for(int i=0;i<accelerate;i++)
        {
            speed = speed + 10;
        }
    }
    
    //loop statement for auto brake
    public void autoBrake()
    {
        for(int d = 0;d<brake;d++)
        {
            speed = speed - 5;
        }
    }
    
}