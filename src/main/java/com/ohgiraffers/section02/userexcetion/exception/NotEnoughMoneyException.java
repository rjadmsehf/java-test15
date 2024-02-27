package com.ohgiraffers.section02.userexcetion.exception;

public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException() {}

    public NotEnoughMoneyException (String mesege){
        super(mesege);
    }
}
