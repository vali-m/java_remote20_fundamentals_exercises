package com.sda.exercises;

import java.util.Scanner;

public class Main {

    //task 5


//    //task 4
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("max=");
//            int max = scanner.nextInt();
//            fizzBuzz(max);
//        }
//
//        public static void fizzBuzz(int max){
//            for(int i = 1; i <= max; i++){
//                if(i % 3 == 0 && i % 7 == 0){
//                    System.out.println("Fizz buzz");
//                } else if(i % 3 == 0){
//                    System.out.println("Fizz");
//                } else if(i % 7 == 0){
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(i);
//                }
//
//            }
//        }

//      //task 3
//    public static void main(String[] args) {
////        //introducere de la tastatura
////        Scanner input = new Scanner(System.in);
////        System.out.print("a=");
////        int a = input.nextInt();
////        System.out.print("b=");
////        int b = input.nextInt();
////        System.out.print("c=");
////        int c = input.nextInt();
////        solveEquation(a, b, c);
//
//        solveEquation(2, 8,1); //x1=-3.9, x2=-0.13
//        solveEquation(1, -13,40); //x1=5, x2=8
//        solveEquation(2, 2,1); //"Delta negative"
//    }
//
//    public static void solveEquation(int a, int b, int c){
//        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
//        double delta = b * b - (4 * a * c);
//        if(delta < 0){
//            System.out.println("Delta negative!");
//            return;
//        }
//        double sqrtDelta = Math.sqrt(delta);
//        double x1 = (-b - sqrtDelta) / (2 * a);
//        double x2 = (-b + sqrtDelta) / (2 * a);
//        System.out.println("Radacinile ecuatiei sunt x1 = " + x1 + " si x2 = " + x2);
//    }


    //task 2
//    public static void main(String[] args) {
//        isBmiOptimal(78.3f, 180);
//    }
//
//    public static void isBmiOptimal(float weightInKg, int heightInCm){
//        float heightInMeters = heightInCm / 100f;
//        float bmi = weightInKg / (heightInMeters * heightInMeters);
////        double bmi2 = weightInKg / Math.pow(heightInMeters, 2);
//        System.out.println(bmi);
//        if(bmi >= 18.5 && bmi <= 24.9){
//            System.out.println("BMI optimal!");
//        } else {
//            System.out.println("BMI not optimal!");
//        }
//    }

        //task 1
//    public static void main(String[] args){
//        System.out.println("Va rog introduceti valoarea diametrului cercului:");
//        Scanner scanner = new Scanner(System.in);
//        float diameter = scanner.nextFloat();
//        System.out.print("Valoarea perimetrului este: ");
//        System.out.println(calculateCirclePerimeter(diameter));
//    }
//
//    public static double calculateCirclePerimeter(float diameter){
//        return diameter * Math.PI;
//    }
}
