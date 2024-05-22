package com.helloworld.calculator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //더하기 연산
        Leekyusub lks = new Leekyusub();
        //lks.plusTwoNumbers();

        // 빼기 연산
        Jdh jdh = new Jdh();
        //jdh.minusTwoNumbersWithScanner(); // 실수를 입력받아 연산 수행

        //곱하기 연산
        Parkhyochan phc = new Parkhyochan();
       // phc.multipleTest();

        //나누기 연산
        Leeuijeong luj = new Leeuijeong();
        // luj.divide();

        System.out.println("Hello World의 계산기입니다.");
        System.out.println("원하는 연산자를 선택하세요");
        Scanner sc = new Scanner(System.in);
        String sign = sc.nextLine();

        switch (sign) {
            case ("+"):
                lks.plusTwoNumbers();

            case ("-"):
                jdh.minusTwoNumbersWithScanner();

            case ("*"):
                phc.multipleTest();

            case ("/"):
                luj.divide();

            case ("exit"):
                break;

            default:
                System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");

        }


        System.out.println("프로그램을 종료합니다.");

    }
}