package com.company.OOPTest;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("deluxe", "Chicken & beef", 9.99, "white");
        super.addHamburgerAddition1("Chips", 1.99);
        super.addHamburgerAddition2("Drinks", 1.99);
    }


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
