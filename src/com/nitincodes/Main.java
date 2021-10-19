package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AUDI a1 = new AUDI();
        BMW b1 = new BMW();
        a1.start();
        b1.start();
    }
}
class BMW extends Car{

    @Override
    void start() {
        System.out.println("BMW is working");
    }
}
class AUDI extends Car{
    @Override
    void start() {
        System.out.println("AUDI is working");
    }
}
abstract class Car{
    int price;
    abstract void start();
}