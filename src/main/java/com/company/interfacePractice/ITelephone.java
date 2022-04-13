package com.company.interfacePractice;

public interface ITelephone {

    //we don't need to defined access modifier to public since it should be handled in the actual class
    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}
