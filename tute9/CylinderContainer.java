
package com.mycompany.lab_9_q1;
public class CylinderContainer extends Container
{
    public CylinderContainer(double radius,double height)
    {
        super(height,radius);
    }
    public double calculateVolume()
    {
        return Math.PI*getRadius()*getRadius()*getHeight();
    }
    
    
    
}
