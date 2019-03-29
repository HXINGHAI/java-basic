package src.sinochemcloud.javayichang;

public class MyException extends Exception{
    private double amount;
    public MyException(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return this.amount;
    }
}
