
package com.mycompany.lab_8;
public class Lab_8 
{

    public static void main(String[] args) 
    {
        SavingsAccount SA1=new SavingsAccount(70606694,20000000);
        CheckingAccount CA1=new CheckingAccount(87819844,100000);
        SA1.calculateInterest();
        CA1.calculateInterest();
        System.out.println("Your Saving Account Interest is: "+SA1.calculateInterest());
        System.out.println("Your Checking Account Interest is: "+CA1.calculateInterest());
        
    }
}
