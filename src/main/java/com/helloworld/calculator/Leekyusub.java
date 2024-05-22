package com.helloworld.calculator;

import java.util.Scanner;

public class Leekyusub {
    public void plusTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요. ");
        double first = sc.nextDouble();
        System.out.println("두 번째 숫자를 입력하세요. ");
        double second = sc.nextDouble();
        double result = first + second;
        System.out.println("첫 번째 숫자와 두 번째 숫자의 합은 " + result + " 입니다.");

    }
}
