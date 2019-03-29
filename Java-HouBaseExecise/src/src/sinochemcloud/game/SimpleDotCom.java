package src.sinochemcloud.game;

import java.util.ArrayList;

/**
 * @author: HXH
 * @date: 2019-03-14 15:31
 * @description:
 */
//public class SimpleDotCom {
//    int numOfHits = 0;
//   private int[] localcell;   //封装
//
//
//    public void setLocalcell(int[] loca){
//        this.localcell = loca;
//    }
//    public String checkYourself(int yourguess){
//      //  int guess = Integer.parseInt(yourguess);
//        String result = "Miss!";
//        for (int cell :
//                localcell) {
//            if (yourguess == cell){
//                result = "Hits!";
//                numOfHits++;
//                break;             //该段代码如果下一次再命中相同的数，就会有问题
//            }
//        }
//        if (numOfHits == localcell.length){
//            result = "Kill!";
//        }
//        System.out.println(result);
//        return result;
//    }
//}


//优化上面的类
public class SimpleDotCom{
    private ArrayList<Integer> localcell;

    public void setLocalcell(ArrayList<Integer> localcell) {
        this.localcell = localcell;
    }
    public String checkYourself(int yourguess){
        String result = "Miss!";
        int index = localcell.indexOf(yourguess);
        if (index >=0){
            localcell.remove(index);
            if (localcell.isEmpty()){
                result = "Kill!";
            }else{
                result = "Hits!";
            }
        }
        return result;
    }
}