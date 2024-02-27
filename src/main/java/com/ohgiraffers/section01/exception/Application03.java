package com.ohgiraffers.section01.exception;

public class Application03 {

    public static void main(String[] args) {

        /* 목차. 3. try-catch 를 이용한 방법 (예외 발생) */

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(50000 , 10000);

            System.out.println("============= 상품 구입 가능 ==============");

        } catch (Exception e) {

            System.out.println("=============상품 구입 불가능 ===============");

        }

        System.out.println("프로그렘이 종료됩니다 ");
    }

}
