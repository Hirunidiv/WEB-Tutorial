
package com.mycompany.lab8_q2;

public class Lab8_q2 
{

    public static void main(String[] args) 
    {
        Rectangle R1=new Rectangle(10,20);
        Circle C1=new Circle(7);
        Triangle T1= new Triangle(6,8,10,5,6);
        System.out.println("Rectangle Area: "+R1.calculateArea());
        System.out.println("Cicle Area: "+C1.calculateArea());
        System.out.println("Triangle Area: "+T1.calculateArea());
        System.out.println("Rectangle Perimeter: "+R1.calculatePerimeter());
        System.out.println("Circle Perimeter: "+C1.calculatePerimeter());
        System.out.println("Triangle Perimeter: "+T1.calculatePerimeter());
        
        
    }
}
