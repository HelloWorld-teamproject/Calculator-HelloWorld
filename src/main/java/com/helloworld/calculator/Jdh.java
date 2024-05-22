package com.helloworld.calculator;

import java.util.Scanner;

public class Jdh {
    public void minusTwoNumbers(double first, double second) {

        double result = first - second;

        System.out.println(first + " - " + second + " = " + result);

    }

    public void minusTwoNumbersWithScanner() {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 수를 입력해주세요 : ");
        double first = sc.nextDouble();

        System.out.println("두 번째 수를 입력해주세요 : ");
        double second = sc.nextDouble();

        double result = first - second;

        System.out.println(first + " - " + second + " = " + result);

    }
}
