package src.sinochemcloud.game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: HXH
 * @date: 2019-03-14 15:44
 * @description:
 */
public class SimpleDataTest {
    public static void main(String[] args) {
        int gamenums = 0;
        SimpleDotCom dot = new SimpleDotCom();
        int local = (int)(Math.random()*5);
        ArrayList<Integer> localtions = new ArrayList<>();
        localtions.add(local);
        localtions.add(local+1);
        localtions.add(local + 2);
       // int[] localtions = {local,local+1,local+2};
        dot.setLocalcell(localtions);
        boolean continueGame = true;

        while (continueGame == true){
            System.out.println("请输入猜测数字：");
            Scanner scan = new Scanner(System.in);
            while (scan.hasNextInt()){
               // System.out.println("请输入猜测数字：");
                //
                int guess = scan.nextInt();
                String result = dot.checkYourself(guess);
                System.out.println(result);
                gamenums++;
                if (result.equals("Kill!")){
                    System.out.println("恭喜猜测次数为："+gamenums);
                }
            }

        }
    }
}
