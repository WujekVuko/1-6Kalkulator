package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        String brake;
try {
    do {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner chara = new Scanner(System.in);
        System.out.println("To jest kalkulator liczb rzeczywistych.");
        System.out.println("Podaj pierwszą liczbę: ");
        double first = in.nextDouble();
        System.out.println("Podaj działanie (+, -, *, /): ");
        String symbol = input.nextLine();
        System.out.println("Podaj drugą liczbę: ");
        double second = in.nextDouble();
        double result = 0;
        switch (symbol) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Ej, nie dzielimy przez 0");
                } else {
                    result = first / second;
                }
                break;
            default:
                System.out.print("Nie ma takiego symbolu. ");
                break;

        }
        System.out.println("Wynik to: " + result);
        System.out.println("Wciśnij enter aby zakończyć działanie programu.");
        brake = chara.next();
        System.out.println(brake);

    }
    while (!brake.equals("\n"));
    System.out.print("koniec");
}
catch (InputMismatchException e){
    System.out.print("To koniec");
}
        }


    }




