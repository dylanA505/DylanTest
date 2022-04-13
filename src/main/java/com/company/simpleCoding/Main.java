package com.company.simpleCoding;

public class Main {

    public static void main(String[] args) {

//        BankAccount defaultAccount = new BankAccount();
//        System.out.println("Account phone number is: " + defaultAccount.getPhoneNumber());
//        System.out.println("Account name is: " + defaultAccount.getCustomerName());
//
//        BankAccount accountDylan  = new BankAccount(1234567,0.00,"Dylan","dylan@gmail.com","4250000000");
//        System.out.println("Account phone number is: " + accountDylan.getPhoneNumber());
//        System.out.println("Account name is: " + accountDylan.getCustomerName());
//
//        accountDylan.depositFunds(100000);
//        accountDylan.withdrawFunds(100);
//
//        accountDylan.depositFunds(600);
//        accountDylan.withdrawFunds(500);


        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());

        VipCustomer vipCustomer2 = new VipCustomer("Dylan", "DylanKing@gmail.com");
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getCreditLimit());

        VipCustomer vipCustomer3 = new VipCustomer("Alina", 500000.00, "alina@gmail.com");
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getEmailAddress());
    }
}
