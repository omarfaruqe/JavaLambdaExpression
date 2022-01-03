package com.omarfaruqe;
@FunctionalInterface
interface Cab{
    double bookCab(String source, String destination);
}
interface Calculator{
    void add(int num1, int num2);
}
class Calc{
    public static void addSomething(int num1, int num2) {
        System.out.println(num1 + " and " + num2 + " addition is " + (num1 + num2));
    }
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
        //new LambdaExpression();

        //Normal Calling
        Calc.addSomething(10, 20);

        // 1. Reference to a Static Method
        Calculator cRef = Calc::addSomething;
        cRef.add(11, 14);
    }
}
