package com.omarfaruqe;
@FunctionalInterface
interface Cab{
    void bookCab();
}

class UberX implements Cab {
    @Override
    public void bookCab() {
        System.out.println("UberX Booked !! Arriving Soon!!");
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
        Cab cab = new UberX();
        cab.bookCab();

        Cab cabWithAnonymous = new Cab(){
            @Override
            public void bookCab() {
                System.out.println("UberX Booked !! Arriving Soon!!");
            }
        };
        cabWithAnonymous.bookCab();
    }
}
