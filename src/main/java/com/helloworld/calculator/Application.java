package com.helloworld.calculator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // class 호출
        Leekyusub lks = new Leekyusub();
        Jdh jdh = new Jdh();
        Parkhyochan phc = new Parkhyochan();
        Leeuijeong luj = new Leeuijeong();
        Scanner sc = new Scanner(System.in);


        //더하기 연산
        //lks.plusTwoNumbers();

        // 빼기 연산
        //jdh.minusTwoNumbersWithScanner(); // 실수를 입력받아 연산 수행

        //곱하기 연산
        // phc.multipleTest();

        //나누기 연산
        // luj.divide();

        System.out.println("Hello World의 계산기입니다.");


        String str = ""; // while 문 초기식(str)
        while (!str.equals("exit")) {

            System.out.println("+, -, *, / 중 원하는 연산자를 선택하세요");
            str = sc.nextLine();

            switch (str) {
                case ("+"):
                    lks.plusTwoNumbers();
                    break;

                case ("-"):
                    jdh.minusTwoNumbersWithScanner();
                    break;

                case ("*"):
                    phc.multipleTest();
                    break;

                case ("/"):
                    luj.divide();
                    break;

                case ("exit"):
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요");

            }

        }
        System.out.println("프로그램을 종료합니다.");

//        jdh.makePi();

    }
}