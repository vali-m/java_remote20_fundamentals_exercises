package com.sda.exercises;

import java.util.Scanner;

public class Main {

    //task 11
    public static void main(String[] args){
        readTexts();
    }

    public static void readTexts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un text!");
        String line;
        String longestString = "";
        do {
            line = scanner.nextLine();
            if (line.length() > longestString.length() && !line.equals("Enough!")) {
                longestString = line;
            }
        } while (!line.equals("Enough!"));
        if (!longestString.equals("")) {
            System.out.println("Cel mai lung String este " + longestString);
        } else {
            System.out.println("No text provided!");
        }
    }

//    //task 10
//    public static void main(String[] args){
//        calculateSumOfDigits(12345);
//    }
//
//    public static void calculateSumOfDigits(int number){
//        int sum = 0;
//        while(number > 0){
//            sum += number % 10;
//            number /= 10;
//        }
//        System.out.println("Sum of all digits: " + sum);
//    }


//    //task 9
//    public static void main(String[] args){
//        printWave(26);
//    }
//
//    public static void printWave(int length){
//        String[] rowPatterns = {
//                "*      **     *",
//                " *    *  *   * ",
//                "  *  *    * *  ",
//                "   **      *   "
//        };
//        int patternRepetitions = length / 15 + 1;
//        for(String rowPattern : rowPatterns){
//            String rowResult = "";
//            for(int i = 0; i < patternRepetitions; i++){
//                rowResult += rowPattern;
//            }
//            System.out.println(shorten(rowResult, length));
//        }
//    }
//
//    public static String shorten(String s, int length){
//        return s.substring(0, Math.min(s.length(), length));
//    }

    //task 8
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Primul numar: ");
//        float number1 = input.nextFloat();
//        System.out.print("Operatiune matematica: ");
//        String operation = input.next();
//        System.out.print("Al doilea numar: ");
//        float number2 = input.nextFloat();
//
//        float result;
//        switch(operation){
//            case "+":
//                result = number1 + number2;
//                System.out.println("Rezultatul este: " + result);
//                break;
//            case "-":
//                result = number1 - number2;
//                System.out.println("Rezultatul este: " + result);
//                break;
//            case "*":
//                result = number1 * number2;
//                System.out.println("Rezultatul este: " + result);
//                break;
//            case "/":
//                if(number2 == 0){
//                    System.out.println("Cannot calculate!");
//                    break;
//                }
//                result = number1 / number2;
//                System.out.println("Rezultatul este: " + result);
//                break;
//            default:
//                System.out.println("Invalid Symbol: " + operation);
//        }
//
//    }



    //task 7
//    public static void main(String[] args){
//        fibonacci(5); // = 8
//    }
//
//    //poz:0 1 2 3 4 5
//    //val:1 1 2 3 5 8
//    public static void fibonacci(int n){
//        int[] fibonacciNumbers = new int[n + 1];
//        fibonacciNumbers[0] = 1;
//        fibonacciNumbers[1] = 1;
//        for(int i = 2; i <= n; i++){
//            fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
//        }
//        System.out.println(fibonacciNumbers[n]);
//    }

//    //task 6
//    public static void main(String[] args){
//        calculateHn(10);
//    }
//
//    public static void calculateHn(int n){
//        //1 + 1/2 + 1/3 + .... + 1/n
//        double sum = 0;
//        for(int i = 1; i <= n; i++){
//            sum += 1.0 / i;
//        }
//        System.out.println(sum);
//    }

//    //task 5
//    public static void main(String[] args){
//        printPrimeNumbersSmallerThan(10);
//    }
//
//    public static void printPrimeNumbersSmallerThan(int max){
//        for(int i = 2; i < max; i++){
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static boolean isPrime(int x){
//        if(x <= 1){
//            System.out.println("Va rog introduceti un numar pozitiv");
//            return false;
//        }
//        for(int i = 2; i < x; i++){
//            if(x % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }


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
