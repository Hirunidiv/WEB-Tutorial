
package com.mycompany.lab8_q2;
class Rectangle implements Shape 
{
    private double height;
    private double width;
    public Rectangle(double h,double w)
    {
        height=h;
        width=w;
    }
    public void setHeight(int h)
    {
        height=h;
    }
    public void setWidth(int w)
    {
        width=w;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWidth()
    {
        return width;
    }
    public double calculateArea()
    {
        return height*width;
    }
    public double calculatePerimeter()
    {
        return 2*(height+width);
    }
    
}
