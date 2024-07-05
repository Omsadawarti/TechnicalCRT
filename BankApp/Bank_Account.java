package com.daaPracticle.BankApp;

import java.util.Scanner;

public class Bank_Account {
    String name ;
    int balance;
    public void inputData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        this. name = sc.next();
        System.out.println("Enter Account Balance:");
        this. balance  = sc.nextInt();
    }

    public  void display()
    {
        System.out.println("Account holder's name is: "+name+" and current account balance is: "+balance);
    }
}

class SavingsAccount extends Bank_Account
{
    public void deposit(int amount)
    {
        if (name.isEmpty())
        {
            System.out.println("Please enter your details first!!");
        }
        balance+=amount;
        System.out.println("Amount of RS."+amount+" is deposited in your bank accont.\n Updated bank balance is: "+balance);
    }
    public void withdraw(int withdrawAmt)
    {
        if (name.isEmpty())
        {
            System.out.println("Please enter your details first!!");
        } else {
            if ((balance - withdrawAmt) <= 1000) {
                System.out.println("Amount of RS." + withdrawAmt + " cannot be withdraw.Minimum balance of RS.1000 need to be maintain in the Bank Account");
            } else {
                balance -= withdrawAmt;
                System.out.println("Amount of RS." + withdrawAmt + " is withdrawed succesfully!!");
            }

        }
        //
    }
}

class CurrentAccount extends Bank_Account
{
    public void deposit(int amount)
    {
        if (name.isEmpty())
        {
            System.out.println("Please enter your details first!!");
        }
        balance+=amount;
        System.out.println("Amount of RS."+amount+" is deposited in your bank accont.\n Updated bank balance is: "+balance);
    }
    public void withdraw(int withdrawAmt)
    {
        if (name.isEmpty())
        {
            System.out.println("Please enter your details first!!");
        } else {
            if ((balance - withdrawAmt) <= 1000) {
                System.out.println("Amount of RS." + withdrawAmt + " cannot be withdraw.Minimum balance of RS.1000 need to be maintain in the Bank Account");
            } else {
                balance -= withdrawAmt;
                System.out.println("Amount of RS." + withdrawAmt + " is withdrawed succesfully!!");
            }

        }
        //
    }
}

class  App
{
    public static void main(String[] args) {


        Scanner  scanner = new Scanner(System.in);

        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        int balance , depositAmt , withdrawAmt ;
        int choise ;
        String name;

        System.out.println("Enter:\n1. Savings Account.\n2. Current Account");
        choise = scanner.nextInt();
    }
}
