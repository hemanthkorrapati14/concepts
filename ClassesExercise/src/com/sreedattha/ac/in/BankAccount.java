package com.sreedattha.ac.in;

public class BankAccount {

    private String Accountnumber;
    private String CustomerName;
    private String phonenumber;
    private String emailid;
    private double AccountBalance;

    public BankAccount(){
    System.out.println("empty constructor");
    }
    public BankAccount(String Accountnumber,String CustomerName,String phonenumber,String emailid,
                       double AccountBalance){
        System.out.println("constructors with parametrs called");
        this.AccountBalance=AccountBalance;
        this.Accountnumber=Accountnumber;
        this.CustomerName=CustomerName;
        this.emailid=emailid;
        this.phonenumber=phonenumber;


    }

    public void deposit(double deposit){
        this.AccountBalance +=deposit;
        System.out.println("deposit amount is"+deposit+"and avialable Balance is"+AccountBalance);
    }
    public void withdraw(int withdraw){
        if (this.AccountBalance-withdraw<0){
            this.AccountBalance-=withdraw;
            System.out.println("unable to process the request as Account balance is"+AccountBalance);

        }else{
            this.AccountBalance -=withdraw;
            System.out.println("withraw amount"+withdraw+"is under process and available balance is"+AccountBalance);
        }

    }

    public String getAccountnumber() {
        return Accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        Accountnumber = accountnumber;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }
}
