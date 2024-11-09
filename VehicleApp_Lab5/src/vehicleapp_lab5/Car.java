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
public class Car extends Vehicle{
    //Data member
    private String model;
    private int cc;
    
    //overloaded constructor
    public Car(String model, int cc, String type, String transmission, String powertrain)
    {
        super(type, transmission, powertrain);
        this.model = model;
        this.cc = cc;
    }
    
    
    public String getModel()
    {
        return model;
    }
    
    public void setModel(String model)
    {
        this.model=model;
    }
    
    public double getLiters()
    {
         return cc/1000;
    }
    
    //overiding methods
    @Override
    public double getRoadTaxPrice()
    {
        double roadTax;
        
        if(cc <= 1000)
            roadTax = 20;
        else if(cc > 1000 && cc <= 1200)
            roadTax = 55;
        else if(cc > 1200 && cc <= 1400)
            roadTax = 70;
        else if(cc > 1400 && cc <= 1600)
            roadTax = 90;
        else if(cc > 1600 && cc <= 1800)
            roadTax =(cc - 1600)*0.4+200;
        else if(cc > 1800 && cc <= 2000)
            roadTax =(cc - 1800)*0.5+280;
        else if(cc > 2000 && cc <= 2500)
            roadTax =(cc - 2000)+380;
        else if(cc > 2500 && cc <= 3000)
            roadTax =(cc - 2500)*2.5+880;
        else
            roadTax =(cc -3000)*4.5+2130;
        
        return roadTax;
    }
}
