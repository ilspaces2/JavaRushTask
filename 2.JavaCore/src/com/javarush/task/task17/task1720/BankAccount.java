package com.javarush.task.task17.task1720;

import java.math.BigDecimal;

public class BankAccount {
    private volatile BigDecimal balance;
    private String owner;

    public BankAccount(String owner) {
        this(BigDecimal.ZERO, owner);
    }

    public BankAccount(BigDecimal balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public synchronized void deposit(BigDecimal money) {  //добавить деньги на счет

            BigDecimal newBalance = balance.add(money);
            System.out.println("Добавляем " + money + ", на счету " + newBalance);
            balance = newBalance;

    }

    public synchronized void withdraw(BigDecimal money) throws NotEnoughMoneyException {

            BigDecimal newBalance = balance.subtract(money);  //тратим деньги со счета

            if (newBalance.compareTo(BigDecimal.ZERO) < 0)
                throw new NotEnoughMoneyException(); //если баланс отрицательный то выкидываем исключение

            balance = newBalance;
            System.out.println("Тратим " + money + ", на счету " + balance); //выводим баланс
    }



    //вводим деньги в виде строки. далее уже работаем с большими числами
    public void deposit(String money) {
        deposit(new BigDecimal(money));
    }

    public void withdraw(String money) throws NotEnoughMoneyException {
        withdraw(new BigDecimal(money));
    }
}
