package com.helloworld.calculator;

public class Application {

    public static void main(String[] args) {
        Leekyusub lks = new Leekyusub();
        lks.plusTwoNumbers();

        double first = 30;
        double second = 15.7;

        // 빼기 연산
        Jdh jdh = new Jdh();
        jdh.minusTwoNumbers(first,second);
        jdh.minusTwoNumbersWithScanner(); // 실수를 입력받아 연산 수행


        Parkhyochan phc = new Parkhyochan();
        phc.multipleTest();

        //곱하기 연산
    }
}
