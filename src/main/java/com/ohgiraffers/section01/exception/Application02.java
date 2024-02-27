package com.ohgiraffers.section01.exception;

public class Application02 {

    public static void main(String[] args) {

        /* 목표     try-catch 블럭을 이용하여 예외처리를 할 수 있다 . */
        /* 목차. 2  try-catch 를 이용한 방법 (에외 발생 하지 안흥ㅁ ) */

        ExceptionTest et = new ExceptionTest();

        /* 상품가격 10000원 , 가지고 있는 돈은 50000원 */
        try {
            et.checkEnoughMoney(10000, 50000);

            System.out.println("============ 상품 구입 가능 ============");


        } catch (Exception e) {
            System.out.println("============ 상품 구입 불가능 ============");
        }

        System.out.println(" 프로그램이 종료됩니다...");
    }
}
