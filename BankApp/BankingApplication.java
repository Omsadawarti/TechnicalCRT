package com.daaPracticle.BankApp;

import java.util.Scanner;

class BankAccount
{
    public int balance = 0;
    public String name = "";



    public void inputData(int balance , String name)
    {
            this. balance = balance;
            this.name = name;
    }
     public void display()
     {
         if (name.isEmpty())
     {
         System.out.println("Please enter your details first!!");
     }
         System.out.println("Your current bank balance is: "+balance);
     }

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
         // banku
     }

}
public class BankingApplication {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        int balance , depositAmt , withdrawAmt ;
        int choise ;
        String name;





        while (true)
        {System.out.println("Enter:\n1.Input Data.\n2.Withdraw.\n3.Show Details.\n4.Deposit.\n5.Exit");
            System.out.println("Enter your choise:");
            choise = scanner.nextInt();

            switch (choise)
            {
                case 1:
                    System.out.println("Enter your name:");
                    name = scanner.next();
                    System.out.println("Enter Account Balance:");
                    balance = scanner.nextInt();
                    bankAccount.inputData(balance,name);
                    break;

                case 2:
                    System.out.println("Enter the amount to be withdraw:");
                    withdrawAmt = scanner.nextInt();
                    bankAccount.withdraw(withdrawAmt);
                    break;
                case 3:
                    bankAccount.display();
                    break;
                case 4:
                    System.out.println("Enter the amount to deposit:");
                    depositAmt = scanner.nextInt();
                    bankAccount.deposit(depositAmt);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter valid choise!!");
                    break;

            }
        }

    }
}
