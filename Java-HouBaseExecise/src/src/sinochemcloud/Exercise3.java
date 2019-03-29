package src.sinochemcloud;

import javax.naming.InsufficientResourcesException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {
    //函数调用
    public static void getGrade(double score){
        if(score<60){
            System.out.println("不及格");
        }else if(score>=60 && score <80){
            System.out.println("优良");
        }else{
            System.out.println("优秀");
        }
    }
    //函数重载
    public static void getGrade(int score){
        if(score<60){
            System.out.println("不及格");
        }else if(score>=60 && score <80){
            System.out.println("优良");
        }else{
            System.out.println("优秀");
        }
    }
    //可变参数的方法
    public static void printMax(double...nums){
        if(nums.length == 0){
            System.out.println("no args to uses!");
            return;
        }
        double result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > result) {
                result = nums[i];
            }
        }
        System.out.println("the max value is : "+ result);
    }

    //错误异常的使用
    @Deprecated  //表示这个方法已经过期，不建议开发者使用。(暗示在将来某个不确定的版本，就有可能会取消掉)
    public void Error(double numbers) throws RemoteException, InsufficientResourcesException{
        //函数方法体
        throw new RemoteException();
    }
    public static void main(String[] args) {
        String str1 = "javajavajavajava";
        String str2 = "aaaaaajavaaaaa";
        String regex = "java";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str1);
        Matcher m2 = p.matcher(str2);
        System.out.println(m.matches());    //全局匹配是否是要求整个序列都匹配
        System.out.println(m.lookingAt());    //不是整个序列都匹配，但是需要从第一个字符开始匹配
        System.out.println(m2.lookingAt());

        //replaceFirst 和replaceAll
        str2 = m2.replaceAll("head");
        str1 = m.replaceFirst("head");
        System.out.println(str2);
        System.out.println(str1);
        //appendReplacement 和 appendTail 方法
        //用于文本替换

        StringBuffer sb = new StringBuffer();
        String regex2 = "a*v";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m3 = p2.matcher(str1);
        while (m3.find()){
            m3.appendReplacement(sb,"-");
        }
        m3.appendTail(sb);
        System.out.println(sb.toString());
        //函数调用
        getGrade(67.3);
        getGrade(90);
        printMax(4,5,6,7,7,8);

        //调用Cake类
        Cake c1 = new Cake(1);
        Cake c2 = new Cake(2);
        Cake c3 = new Cake(3);

        System.out.println(c1 + " " +c2 +" "+ c3);
        c2 = c3 =null;
        System.gc();   //系统

        //Scanner类
//        Scanner scaaner = new Scanner(System.in);
//        if (scaaner.hasNext()){
//            String str3 = scaaner.next();
//            System.out.println("输入的数据为：" +str3);
//        }//检测到空格之后就不会输出了
//        scaaner.close();
//
//        Scanner scanner = new Scanner(System.in);
//        if(scanner.hasNextLine()){
//            String str4 = scanner.nextLine();
//            System.out.println(str4);
//        } //可以有空格
//        scanner.close();
        //求和
//        Scanner san = new Scanner(System.in);
//        double sum = 0;
//        int num = 0;
//        if (san.hasNextDouble()){
//            sum = sum + san.nextDouble();
//            num++;
//            System.out.println("总和为："+sum);
//            System.out.println("平均数为："+(sum/num));
//        }
//        san.close();

        //异常捕获
        try{
            int[] array = new int[4];
            System.out.println("数组为："+array[8]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception throws:" +e);
            System.out.println(e.getMessage());
        }

        try{
            File fileName = new File("D:/HXHs.txt");
            FileInputStream file = new FileInputStream(fileName);
            char x = (char) file.read();
            System.out.println(x);
        }catch (FileNotFoundException f){
            f.printStackTrace();
            return;
        }catch (IOException i){
            i.printStackTrace();
            return;
        }
    }
}
