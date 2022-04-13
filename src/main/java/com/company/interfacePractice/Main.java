package com.company.interfacePractice;

public class Main {

    public static void main(String[] args) {

        ITelephone dylansPhone;
        dylansPhone = new DeskPhone(123456);
        dylansPhone.powerOn();
        dylansPhone.callPhone(123456);
        dylansPhone.answer();

        dylansPhone = new MobilePhone(234567);
        dylansPhone.callPhone(234567);
        dylansPhone.answer();

    }
}
