package com.ohgiraffers.section02.userexcetion;

import com.ohgiraffers.section02.userexcetion.exception.MoneyNagativeExcption;
import com.ohgiraffers.section02.userexcetion.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexcetion.exception.PriceNegativeException;

public class Application02 {

    public static void main(String[] args) {

        /* 목표. 다양한 타입의 예외를 multi block 을 이용해서 처리할 수 있다 . */
        /* 필기.
            디테일한 예외 상황별로 처리 로직을 다르게 할 수 있다.
            이 떄 주의할 점은 상위 타입이 catch 블럭 상단에 있을 경우
            하단에 작성한 코드는 절대 도달할 수 없는 코드가 되므로 컴파일 에러를 발생시킨다.
         */

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(30000, 200);

        } catch (PriceNegativeException e) {

            System.out.println("PriceNegativeException 발생 비상!");
            // 예외 인스턴스 생성 시 전달한 메세지를 getMessage() 로 호출할 수 있다 .
            System.out.println(e.getMessage());

        } catch (MoneyNagativeExcption e) {
            System.out.println("MoneyNagativeExcption 발생 비상!");
            System.out.println(e.getMessage());

        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException 발생 비상!");
            System.out.println(e.getMessage());
        } finally {
            // 예외 발생 여부와 상관 없이 실행할 내용
            System.out.println("finally 블럭의 내용 작동함");
        }

        System.out.println("프로그램을 종료합니다......");


    }
}
