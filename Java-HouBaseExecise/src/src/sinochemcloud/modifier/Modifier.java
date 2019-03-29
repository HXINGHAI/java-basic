package src.sinochemcloud.modifier;

import com.sun.org.apache.xpath.internal.operations.Mod;

public class Modifier {//修饰符
    //static用来创建类方法和类变量
    private static int nums = 0;
    public static final String CONST = "final修饰符不能被修改";
    protected static int getNums(){
        return nums;
    }
    private static void addNums(){
        nums++;
    }
    Modifier(){
        Modifier.addNums();
    }

//    public void changeConst(){
//        CONST = "change";            //不能被修改
//    }

    public static void main(String[] args) {
        System.out.println("开始：" + getNums() );
        for (int i = 0; i < 500; i++) {
            new Modifier();
        }
        System.out.println("结束：" + getNums());

    }
}
