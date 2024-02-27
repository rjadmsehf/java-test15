package com.ohgiraffers.section02.userexcetion;

import com.ohgiraffers.section02.userexcetion.exception.MoneyNagativeExcption;
import com.ohgiraffers.section02.userexcetion.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexcetion.exception.PriceNegativeException;

public class Application03 {

    public static void main(String[] args) {

        /* 목표 multi-catch 블럭으로 동일한 레벨의 다른 타입 예외를 하나의 catch 블럭으로 처리할 수 있다. */

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(2000,10000);

        } catch (PriceNegativeException  | MoneyNagativeExcption e) {

            System.out.println(e.getClass() + " 발생 !!!!");
            System.out.println(e.getMessage());

        } catch (NotEnoughMoneyException e) {
         /* 필기
             예외 클래스명, 예외 발행 위치, 예외 메세지 등을 빨간 글씨로 로그 형태로 출력해주는 기능
         */
            e.printStackTrace();
        }





    }
}
