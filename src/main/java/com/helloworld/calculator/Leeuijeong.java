package com.helloworld.calculator;

import java.util.Scanner;

public class Leeuijeong {

    public void divide() {

        Scanner sc = new Scanner(System.in);

        System.out.print("나눗셈을 할 첫번째 실수를 입력해 주세요 : ");
        double first = sc.nextDouble();

        System.out.print("나눗셈을 할 두번째 실수를 입력해 주세요 : ");
        double second = sc.nextDouble();

        double result = first / second;

        System.out.println(first + " / " + second + " = " + result + " 입니다.");

    }




}
