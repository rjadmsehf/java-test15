package com.ohgiraffers.section02.userexcetion;

import com.ohgiraffers.section02.userexcetion.exception.MoneyNagativeExcption;
import com.ohgiraffers.section02.userexcetion.exception.PriceNegativeException;

public class Application01 {

    public static void main(String[] args) {

        /* 목표 사용자 정의의 예외클래스를 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다 */

        /* 필기.
            사전의 정의된 예외클래스 외에 개발자(여러분) 가 원하는 명칭의 예외 클래스를 작성하는 것이
            가능하다
            extends Exception 으로 예외처리 클래스를 더 구체적인 예외 이름을 정의하는 것이다.
         */

        ExceptionTest et = new ExceptionTest();
        try {
            // 상품의 가격을 음수로 입력한 경우
//            et.checkEnoughMoney(-50000 ,  50000);
            // 가진 돈을 으ㅁ수로 입력한 경우
//        et.checkEnoughMoney(50000,  -10000);
            // 가진 돈이 상품이 가격보다 적을 때
//            et.checkEnoughMoney(50000,10000);
            // 정상적 구매가 가능할때
            et.checkEnoughMoney(1000000,50000);
        } catch (Exception e) {

            throw new RuntimeException(e);

        }

    }
}
