package com.helloworld.calculator;

public class Application {

    public static void main(String[] args) {

        //더하기 연산
        Leekyusub lks = new Leekyusub();
        lks.plusTwoNumbers();

        // 빼기 연산
        Jdh jdh = new Jdh();
        jdh.minusTwoNumbersWithScanner(); // 실수를 입력받아 연산 수행

        //곱하기 연산
        Parkhyochan phc = new Parkhyochan();
        phc.multipleTest();

    }
}
