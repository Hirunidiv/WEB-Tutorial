
package com.mycompany.lab_8;
public class CheckingAccount extends BankAccount
{
    public CheckingAccount(int accountNumber,double balance)
    {
        super(accountNumber,balance);
    }
    public double calculateInterest()
    {
        double interestRate=0.02;
        return getbalance()*interestRate;
    }
}
