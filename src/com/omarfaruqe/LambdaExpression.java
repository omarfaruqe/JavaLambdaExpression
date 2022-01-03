package com.omarfaruqe;
@FunctionalInterface
interface Cab{
    double bookCab(String source, String destination);
}

public class LambdaExpression {
    public int instanceVar = 10;
    public static int staticVar = 100;
    LambdaExpression(){
        double fare = cabWithLambda.bookCab("Rajshahi","Dhaka");
        System.out.println("Fare is " + fare);
    }

    Cab cabWithLambda = (source, destination) -> {
        int localVar = 200;
        System.out.println("UberX Booked from " + source + " To " + destination + ", Arriving Soon!!");
        System.out.println("Local variable localVar: " + localVar);
        System.out.println("Instance variable instanceVar: " + instanceVar);
        System.out.println("Static variable staticVar: " + LambdaExpression.staticVar);
        return 320.56;
    };

    public static void main(String[] args) {
        new LambdaExpression();
    }
}
