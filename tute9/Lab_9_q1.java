
package com.mycompany.lab_9_q1;
public class Lab_9_q1 {

    public static void main(String[] args) 
    {
        CylinderContainer CC1=new CylinderContainer(8,10);
        CC1.calculateVolume();
        System.out.println("Volume: "+CC1.calculateVolume());
    }
}
