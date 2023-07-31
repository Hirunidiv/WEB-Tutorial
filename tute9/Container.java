package com.mycompany.lab_9_q1;
public abstract class Container 
{
    private double height;
    private double radius;
    public Container(double h,double r)
    {
        radius=r;
        height=h;
    }
   public abstract double calculateVolume(); 
   public void setRadius(double r)
   {
       radius=r;
   }
   public void setHeight(double h)
   {
       height=h;
   }
   public double getRadius()
   {
       return radius;
   }
   public double getHeight()
   {
       return height;
   }
}
