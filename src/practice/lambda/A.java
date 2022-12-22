package practice.lambda;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class A {

    public static void main(String[] args) {
        System.out.println("Lambda expression example.");

        Consumer<String> consumer = System.out::println;

    }
}


//key to note about Java Lambda expression.
// 1. Lambda expression provide the implementation of functional interface. It is very useful in the
// collection framework.
// The functional interface are here: Consumer, Runnable, Predicate etc. (Built in functional
// interface) or custom interface by the user/programmer.
// A Lambda expression is used to provide the implementation of an interface (functional)
// which has functional interface.
// Here we just write the implementation code.
// Java lambda expression is treated as a function, hence there is no class file created of
//lambda expression

//Why use Lambda expression ?
//1. Less coding
// 2. Provide implementation of functional interface
// 3. Ease the collection framework