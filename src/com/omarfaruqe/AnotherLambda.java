package com.omarfaruqe;

import java.util.*;
import java.util.function.*;
interface Thing{
    int doSomething(int a, int b);
}

public class AnotherLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2,56, 673, 6, 43, 22);

        for(int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) > 25){
                System.out.print(numbers.get(i) + " ");
            }
        }

        System.out.println();
        for(int number: numbers){
            if (number > 25){
                System.out.print(number + " ");
            }
        }

        System.out.println();
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                if (number > 25){
                    System.out.print(number + " ");
                }
            }
        });

        System.out.println();
        numbers.forEach((number) -> {
                if (number > 25){
                    System.out.print(number + " ");
                }
        });

        System.out.println("\nUsing Stream API Anonymous Class");
        numbers.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                if (number > 25)
                    return true;
                else
                    return false;
            }
        }).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                System.out.print(number + " ");
            }
        });

        System.out.println("\nUsing Stream API Lambda Expression");
        numbers.stream()
                .filter( number -> number > 25)
                .forEach( System.out::println);
    }
}
