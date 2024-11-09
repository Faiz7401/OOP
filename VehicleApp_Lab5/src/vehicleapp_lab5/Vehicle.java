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
public class Vehicle {
    //Data member
    protected String type;
    protected String transmission;
    protected String powertrain;
    protected int speed;//class variable

    //Constructor: initialize the data memnber
    public Vehicle (String type, String transmission, String powertrain)
    { 
        this.type = type;
        this.transmission = transmission;
        this.powertrain = powertrain;
        speed = 60;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
    
    public void setTransmission(String transmission)
    {
        this.transmission = transmission;
    }
    
    public void setPowertrain(String powertrain)
    {
        this.powertrain = powertrain;
    }
    
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
    
    public double getRoadTaxPrice()
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
    public double autoAccelerate(int accelerate)
    {
        for(int i=0;i<accelerate;i++)
        {
            speed = speed + 10;
        }
        return speed;
    }
    
    //loop statement for auto brake
    public double autoBrake(int brake)
    {
        for(int d = 0;d<brake;d++)
        {
            speed = speed - 5;
        }
        if(speed<0)
        {
            speed = 0;
        }
        return speed;
    }
}
