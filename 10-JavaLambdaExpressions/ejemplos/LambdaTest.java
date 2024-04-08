/**
   @version 1.00 2020-04-03
   @author Agust´in González
*/

import java.awt.event.*;
import java.text.*;
import javax.swing.*;

public class LambdaTest  {  
   public static void main(String[] args) {  
      // construct a bank account with initial balance of $10,000
      BankAccount account = new BankAccount(10000);
      // start accumulating interest at 10%
      account.start(10);

      // keep program running until user selects "Ok"
      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);
   }
}

class BankAccount {  
   /**
      Constructs a bank account with an initial balance
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance){  
      balance = initialBalance;
   }

   /**
      Starts a simulation in which interest is added once per
      second
      @param rate the interest rate in percent
   */
   public void start(final double rate)  {     
      Timer t = new Timer(1000, event -> {
               double interest = balance * rate / 100;
               balance += interest;
               NumberFormat formatter 
                  = NumberFormat.getCurrencyInstance();
               System.out.println("balance=" 
                  + formatter.format(balance));

      });
      t.start();
   }

   private double balance;
}
