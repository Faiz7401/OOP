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
public class Tire {
    
    //Data Member
    int rimDiameter;
    int width;
    int aspectRatio;
    char speedRating;
    
    public Tire(int rimDiameter, int width, int aspectRatio, char speedRating)
    {
        this.rimDiameter = rimDiameter;
        this.width = width;
        this.aspectRatio = aspectRatio;
        this.speedRating = speedRating;
    }
    
    public void setRimDiameter(int rimDiameter)
    {
        this.rimDiameter = rimDiameter;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public void setAspectRatio(int aspectRatio)
    {
        this.aspectRatio=aspectRatio;
    }
    
    public void setSpeedRating(char speedRating)
    {
        this.speedRating = speedRating;
    }
    
    public double getRimDiameter()
    {
        return rimDiameter;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getAspectRatio()
    {
        return aspectRatio;
    }
    
    public double getSpeedRating()
    {
        int maxSpeed;
        switch (speedRating) {
            case 'R':
                maxSpeed = 170;
                break;
            case 'S':
                maxSpeed = 180;
                break;
            case 'T':
                maxSpeed = 190;
                break;
            case 'U':
                maxSpeed = 200;
                break;
            case 'H':
                maxSpeed = 210;
                break;
            case 'V':
                maxSpeed = 240;
                break;
            default:
                maxSpeed=0;
                break;
        }
        return maxSpeed;
    }
    
}
