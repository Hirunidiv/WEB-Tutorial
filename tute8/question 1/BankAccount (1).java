
package com.mycompany.lab_8;
abstract class BankAccount 
{
    private int accountNumber;
    private double balance;
    public BankAccount(int a,double b)
    {
        accountNumber=a;
        balance=b;
    }
    public void setaccountNumber(int a)
    {
        accountNumber=a;
    }
    public int getaccountNumber()
    {
        return accountNumber;
    }
     public void setbalance(double b)
    {
        balance=b;
    }
    public double getbalance()
    {
        return balance;
    }
    public abstract double calculateInterest(); 
}
