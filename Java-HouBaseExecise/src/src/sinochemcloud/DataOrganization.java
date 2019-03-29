package src.sinochemcloud;

import java.util.*;
import java.util.regex.Matcher;

/**
 * @author: HXH
 * @date: 2019-03-12 09:14
 * @description:
 */
public class DataOrganization {
    static void showPush(Stack<Integer> st,int a){
        st.push(new Integer(a));
        System.out.println(a + " " + st);
    }
    static void showPop(Stack<Integer> st){
        System.out.println("pop--->");
        Integer a = st.pop();
        System.out.println(a +" "+st);
    }
    public static void main(String[] args) {
        Long beginTime = System.currentTimeMillis();
        Enumeration<String> days;//枚举
        Vector<String> dayNames = new Vector<>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }

        //位集合
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);
        //set
        for (int i = 0; i < 16; i++) {
            if ((i%2) == 0){
                bits1.set(i);
            }
            if ((i%5) != 0){
                bits2.set(i);
            }
        }
        System.out.println(bits1 + "\n" +bits2);
        //add
        bits2.and(bits1);
        System.out.println("\n" + bits2);
        //or
        bits2.or(bits1);
        System.out.println("\n" + bits2);
        //xor
        bits2.xor(bits1);
        System.out.println("\n" + bits2);

        //向量
        Vector v = new Vector(3,2);
        System.out.println("First:" + v.size() + " " +v.capacity());
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));//初始容量为3，而现在增加了四个元素，造成容量溢出，然后触发每次容量溢出时，容量增加2的事件，在这capacity为3+2=5
        System.out.println("Second:" + v.size() + " " +v.capacity());
        System.out.println(v.toString());

      v.addElement(new Double(54.2));
        System.out.println("Third:" + v.size() + " " +v.capacity());
        v.addElement(new Double(44.3));
        v.addElement(new Integer(45));
        System.out.println("Forth" + v.size() + " " +v.capacity());
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.clone());   //返回这个向量的一个副本
        Enumeration s = v.elements();
        while(s.hasMoreElements()){
            System.out.println(s.nextElement());
        }

        //堆栈
        Stack<Integer> st = new Stack<>();
        System.out.println(st);
        showPush(st,43);
        showPush(st,54);
        showPush(st,99);
        showPop(st);
        showPop(st);
        showPop(st);
        try{
            showPop(st);
        }catch (EmptyStackException e){
            System.out.println("Empty Stack");
        }
      //Map集合
        Map sp = new HashMap();
        sp.put("shandong","qingdao");
        sp.put("gansu","lanzhou");
        sp.put("zhejiang","hangzhou");
        System.out.println(sp.isEmpty());
        System.out.println("中国地区：");
        System.out.println(sp);
        //HashTable
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;
        balance.put("shandong",new Double(34.345));
        balance.put("gansu",new Double(4567.343));
        balance.put("zhejiang",new Double(565.3));
        names = balance.keys(); //得到k值队列赋值给枚举对象
        while(names.hasMoreElements()){
            String s2 = (String)names.nextElement();
            System.out.println(balance.get(s2)); //get方法是得到哈希表的value值
        }

        bal = ((Double) balance.get("gansu")).doubleValue();
        balance.put("gansu",new Double(bal+1000));
        System.out.println("gansu new balance:" + balance.get("gansu"));

        Long endTime  = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("程序运行时间：" + (endTime - beginTime));
    }

}
