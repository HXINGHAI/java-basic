package src.sinochemcloud.javayichang;

import javax.naming.InsufficientResourcesException;

public class CheckingAccount {
    private double balance;
    private int numbers;
    public CheckingAccount(int numbers){
        this.numbers = numbers;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withDraw(double amount) throws MyException{
        if (amount <= balance){
            balance = balance - amount;
        }else{
            double needs = amount - balance;
            throw new MyException(needs);
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getNumbers(){
        return numbers;
    }
}
