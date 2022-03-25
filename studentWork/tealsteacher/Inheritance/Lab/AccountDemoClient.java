package Lab;

import java.util.Scanner;

public class AccountDemoClient {
   public static void main(String[] args) {

      System.out.println("Enter the Savings account number");
      Scanner inputAccountNum = new Scanner(System.in);
      int savingsInputNum = inputAccountNum.nextInt();
      System.out.println("Enter the Checkings account number");
      int checkingInputNum = inputAccountNum.nextInt();
      System.out.println("Enter the CD account number");
      int cdInputNum = inputAccountNum.nextInt();
      System.out.println("Enter the CD term");
      int termInputNum = inputAccountNum.nextInt();


      SavingsAccount sa = new SavingsAccount(savingsInputNum, 10000);
      System.out.println("account number: " + sa.getAccoutNum());
      System.out.println("account type: " + sa.getType());
      System.out.println("initial amount: " + sa.getAmount());
      sa.deposit(5000);
      System.out.println("new amount after deposit: " + sa.getAmount());

      CheckingAccount ca = new CheckingAccount(checkingInputNum, 20000);
      System.out.println("account number: " + ca.getAccoutNum());
      System.out.println("account type: " + ca.getType());
      System.out.println("initial amount: " + ca.getAmount());
      ca.deposit(6000);
      System.out.println("new amount after deposit: " + ca.getAmount());
      ca.withdraw(3000);
      System.out.println("new amount after withdrawal: " + ca.getAmount());

      CdAccount cd = new CdAccount(cdInputNum, 50000);
      System.out.println("account number: " + cd.getAccoutNum());
      System.out.println("account type: " + cd.getType());
      System.out.println("initial amount: " + cd.getAmount());
      cd.term(termInputNum);
      System.out.println("cd term (months): " + cd.getTerm());
   }
}