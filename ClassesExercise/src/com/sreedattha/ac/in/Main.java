package com.sreedattha.ac.in;

public class Main {

    public static void main(String[] args) {
       // BankAccount object =new BankAccount();



         BankAccount object =new BankAccount("12345","hemanth","5464784","hemanyth@",100);
       // object.setAccountBalance(100);
        object.deposit(200);
        object.withdraw(23);

       System.out.println("account balance"+object.getAccountBalance());
        System.out.println( "account number"+object.getAccountnumber());
        System.out.println("customer name"+object.getCustomerName());




     }
}
