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
public class MountainBike extends Bicycle{
    
    public int seatHeight;
    
    public MountainBike( int startHeight, int startSpeed, int startGear)
    {
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }
    
    public void setHeight(int newValue)
    {
        
    }
}
