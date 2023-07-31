
package com.mycompany.lab8_q2;
class Circle implements Shape
{
    private double radius;
    public Circle(double r)
    {
        radius=r;
    }
    public void setRadius(int r)
    {
        radius=r;
    }
    public double getRadius()
    {
        return radius;
    }
    public double calculateArea()
    {
        return Math.PI*radius*radius;
    }
    public double calculatePerimeter()
    {
        return 2*Math.PI*radius;
    }
}
