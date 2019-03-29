package src.sinochemcloud;

import java.text.SimpleDateFormat;
import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        //字符串之间的比较
        String str1 = "Hello World";
        String str2 = "hello world";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));   //忽略大小写
        Object obj = str1;
        System.out.println(obj);

        //查找字符串最后一次出现的位置
        String str3 = "hello my name is noob checkout";
        int lastindex = str3.lastIndexOf("noob");
        if (lastindex == -1){
            System.out.println("没有找到该字符串！");
        }else{
            System.out.println("最后一次出现的位置：" + lastindex);
        }
        //字符串分割
        String str4 = "the best thing is that i meeting for you,sinochem of China,A-E-I-O-U0";
        String str5 = "www.baidu.com";
        String arrayString[] = str5.split("\\.");
        for(String apex :arrayString){
            System.out.println(apex);
        }
        //输出时间格式化时间格式
        Date date = new Date();
        SimpleDateFormat sdate = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss a");
        System.out.println(sdate.format(date));
        System.out.println(date);
        //数组的定义
        int[] array1 = {2,33,-5,75,8,9,15};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        //第二种遍历方式
//        for(int element :array1){
//            System.out.println(element);
//        }
        //数组的排序
        Arrays.sort(array1);
        for(int element : array1){
            System.out.print(" "+element);
        }
        System.out.printf("\n");
        //二维数组的长度定义
        int[][] array2 = new int[2][5];
        System.out.println(array2.length);
        System.out.println(array2[0].length);
        //数组反转
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("反转前的序列："+arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转之后的序列："+arrayList);
        //获取数组的最大值最小值
        Integer[] arraytest = {3,4,5,6,73,33};
        int min = Collections.min(Arrays.asList(arraytest));
        int max = Collections.max(Arrays.asList(arraytest));
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);

        //数组合并
        String[] strings1 = {"a","e","i","o","u"};
        String[] strings2 = {"2","3","4","5"};
        List list = new ArrayList(Arrays.asList(strings1));
        list.addAll(Arrays.asList(strings2));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
        //查找数组中的重复元素
        int[] inter = {1,2,3,4,5,6,6,7,7,1,1,6,6,6,6,4534,33,4534,354,54,34,5,4534,543,534,5345};          //只能是两个元素重复   多余就作废,在这儿我做了改动，可以三个元素

        for (int i = 0; i < inter.length; i++) {
            int count = 0;
            for (int j = i+1; j < inter.length; j++) {
                if (inter[i] == inter[j]){
                    count++;
                }

            }
            if (count == 1){
                System.out.println("重复的元素是："+inter[i]);
            }
//            if(count == 1){
//                System.out.println("重复的元素是："+inter[i]);
//                count = 0;
//            }
        }

        //数组交集  定义一个ArrayList
        ArrayList objarray1 = new ArrayList();
        ArrayList objarray2 = new ArrayList();
        objarray1.add(0,"common1");
        objarray1.add(1,"common2");
        objarray1.add(2,"notcommon");
        objarray1.add(3,"notcommon1");
        objarray2.add(0,"common1");
        objarray2.add(1,"common2");
        objarray2.add(2,"notcommon2");
        System.out.println("array1:"+objarray1);
        System.out.println("array2:"+objarray2);
        objarray1.retainAll(objarray2);
        System.out.println("交集为"+objarray1);
        int tb = (int)(Math.random()*10);     //生成10以内的随机数
        System.out.println(tb);

        String[] strArray = {"aaa", "ggg", "ccc"};
        String[] strArray2 = {"aaa", "ggg", "ccc"};
        System.out.println("两个数组是否相等？"+Arrays.equals(strArray,strArray2));

        //时间戳转换成时间
        Long timeStamp = System.currentTimeMillis();
        SimpleDateFormat sp = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
       // String sd = sp.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("时间为："+" "+sp.format(timeStamp));

        Date dates = new Date();
        System.out.println(sp.format(dates));
    }
}
