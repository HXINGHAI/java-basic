package src.sinochemcloud.game2;

/**
 * @author: HXH
 * @date: 2019-03-14 16:20
 * @description:
 */
public class GameTestDrive {

    public static void main(String[] args) {
        PlayerOne player1 = new PlayerOne();
        PlayerOne player2 = new PlayerOne();
        PlayerOne player3 = new PlayerOne();

        //系统的生成随机数
        int systemRandom = (int)(Math.random()*5);

        int p1 = player1.PlayerGuess(5);
        int p2 = player2.PlayerGuess(6);
        int p3 = player3.PlayerGuess(7);
//        System.out.println(p1 +"" +p2+""+p3);
        boolean player1Status = false;
        boolean player2Status = false;
        boolean player3Status = false;

        int gamenums = 0;
        while (true){
            if (p1 == systemRandom){
                player1Status = true;
            }
            if (p2 == systemRandom){
                player2Status = true;
            }
            if (p3 == systemRandom){
                player3Status = true;
            }
            if (player1Status || player2Status || player3Status){
                System.out.println("系统数字为："+systemRandom);
                System.out.println("player1的猜测为："+p1);
                System.out.println("player2的猜测为："+p2);
                System.out.println("player3的猜测为："+p3);
                gamenums++;
                System.out.println("游戏结束,进行游戏轮数为："+gamenums);
                break;
            }else{
                System.out.println("没有获胜者，继续游戏！");
            }
        }
    }
}
