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
public class Bicycle {
    
    protected int gear;
    protected int speed;
    
    public Bicycle(int startSpeed, int startGear)
    {
        speed = startSpeed;
        gear = startGear;
    }
    
    public void setGear(int newValue)
    {
        gear = newValue;
    }
    
    public void applyBreak(int decremeant)
    {
        speed -= decremeant;
        
        
        
        if (speed <= 0)
        {
            speed = 0;
        }
    }
    
    public void sppedUp(int incremeant)
    {
        speed += incremeant;
    }
}
