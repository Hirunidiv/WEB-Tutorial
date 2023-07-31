
package com.mycompany.lab_8;
public class SavingsAccount extends BankAccount
{
    public SavingsAccount(int accountNumber,double balance)
    {
        super(accountNumber,balance);
    }
    public double calculateInterest()
    {
        double interestRate=0.12;
        return getbalance()*interestRate;
    }
    
}
