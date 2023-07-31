
package com.mycompany.lab8_q2;
class Triangle implements Shape 
{
    private double height;
    private double base;
    private double a,b,c;
    public Triangle(double h,double base,double a,double b,double c)
    {
        height=h;
        this.base=base;
        this.a=a;
        this.b=b;
        this.c=c;
        
    }
    public void setHeight(int h)
    {
        height=h;
    }
    public void setBase(int base)
    {
        this.base=base;
    }
    public void setA(int a)
    {
        this.a=a;
    }
    public void setB(int b)
    {
        this.b=b;
    }
    public void setC(int c)
    {
        this.c=c;
    }
    public double getHeight()
    {
        return height;
    }
    public double getBase()
    {
        return base;
    }
    public double getA()
    {
        return a;
    }
    public double getB()
    {
        return b;
    }
    public double getC()
    {
        return c;
    }
    
    public double calculateArea()
    {
        return (height*base)/2;
    }
    public double calculatePerimeter()
    {
        return a+b+c;
    }
    
}
