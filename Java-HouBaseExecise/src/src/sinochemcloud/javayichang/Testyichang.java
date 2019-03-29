package src.sinochemcloud.javayichang;

public class Testyichang {
    public static void main(String[] args) throws MyException, InterruptedException {
        CheckingAccount c = new CheckingAccount(71738);
        System.out.println("存入10000元");
        c.deposit(10000);

            System.out.println("\n取走2000元");
            c.withDraw(2000);
            System.out.println("\n再取走9000元");
            c.withDraw(9000);
//        }catch (MyException e){
//            System.out.println("超出预支："+ e.getAmount());
//            e.printStackTrace();
//        }
        Thread.sleep(1000*2);
    }
}
