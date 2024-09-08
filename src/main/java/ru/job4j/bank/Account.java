package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель данных банковского счета
 *
 * @author Maria Vasileva
 * @version 1.0
 */
public class Account {
    /**
     * Хранит реквизиты банковского счета
     */
    private String requisite;
    /**
     * Храненит баланс банковского счета
     */
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Сравнивание счета
     *
     * @param o банковский счет
     * @return true, если реквизиты равны
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}