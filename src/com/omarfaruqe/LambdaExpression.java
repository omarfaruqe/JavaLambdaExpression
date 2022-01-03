package com.omarfaruqe;
@FunctionalInterface
interface Cab{
    void bookCab(String source, String destination);
}

//class UberX implements Cab {
//    @Override
//    public void bookCab() {
//        System.out.println("UberX Booked !! Arriving Soon!!");
//    }
//}

public class LambdaExpression {
    public static void main(String[] args) {
//        Cab cab = new UberX();
//        cab.bookCab();
//
//        Cab cabWithAnonymous = new Cab(){
//            @Override
//            public void bookCab() {
//                System.out.println("UberX Booked !! Arriving Soon!!");
//            }
//        };
//        cabWithAnonymous.bookCab();

        Cab cabWithLambda = (source, destination) ->
            System.out.println("UberX Booked from " + source + " To " + destination + ", Arriving Soon!!");
        cabWithLambda.bookCab("Dhaka", "Rajshahi");
    }
}
