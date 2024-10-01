package org.example;

import io.vavr.Tuple4;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();

        Tuple4 params = task.returningTuple4();

        System.out.println("Param 1: " + params._1());
        System.out.println("Param 2: " + params._2());
        System.out.println("Param 3: " + params._3());
        System.out.println("Param 4: " + params._4());
    }
}