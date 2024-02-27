package com.ohgiraffers.section02.userexcetion;

import com.ohgiraffers.section02.userexcetion.exception.MoneyNagativeExcption;
import com.ohgiraffers.section02.userexcetion.exception.NegativeException;
import com.ohgiraffers.section02.userexcetion.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexcetion.exception.PriceNegativeException;

public class ExceptionTest {



    public void checkEnoughMoney(int price , int money) throws PriceNegativeException, MoneyNagativeExcption, NotEnoughMoneyException {

        if(price < 0 ) {
            throw new PriceNegativeException("상품의 가격은 음수일 수 없습니다.");
        }

        if(money < 0){
            throw new MoneyNagativeExcption("가지고 있는 돈은 음수 일 수 없습니다.");
        }

        if(money < price){
            throw new NotEnoughMoneyException("가진 돈 보다 상품가격이 높음");
        }

        System.out.println("가진돈이 충분합니다. 즐거운 쇼핑 하세요");
    }

}
