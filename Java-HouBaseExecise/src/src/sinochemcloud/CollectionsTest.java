package src.sinochemcloud;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

/**
 * @author: HXH
 * @date: 2019-03-13 10:37
 * @description:
 */
public class CollectionsTest {
    //泛型函数
    public static <E> void printArray(E[] input){
        for (E element :
                input) {
            System.out.println(element);
        }
        System.out.println();
    }
    public static void getData(List<?> data){
        System.out.println(data.get(0));
    }

    public static void main(String[] args) {
        //遍历ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("成就用户，持续创新");
        list.add("高效协作进取担当");
        list.add("智慧运营商");
        //第一种遍历方法
        for (String element :
                list) {
            System.out.println(element);
        }
        //第二种遍历方法
        //把链表变成数组进行遍历
        String[] array = new String[list.size()];
        list.toArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //第三种遍历方法（迭代器）该方法可以不用担心在遍历的过程中会超出集合的长度。
        Iterator<String> ite = list.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

        //遍历map
        Map<String,String> mp = new HashMap<>();
        mp.put("1","value1");
        mp.put("2","value2");
        mp.put("3","value3");
        //第一种遍历方法
        for (String key :
                mp.keySet()) {
            System.out.println(mp.get(key));
        }
        //第二种遍历迭代器
        Iterator<Map.Entry<String,String>> it = mp.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
        //第三种（适合容量大的map遍历）
        for (Map.Entry<String, String> entry:
        mp.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        //第四种 遍历所有的value，但是不能遍历key
        for (String v :
                mp.values()) {
            System.out.println(v);
        }
        //Java集合的使用
        Collection col = new ArrayList();
         col.add("test1");
        ((ArrayList) col).add("test2");
        ((ArrayList) col).add("test3");
//        //删除元素
//        col.remove("test2");
//
//        //删除所有元素
//        col.removeAll(col);
        System.out.println(col.isEmpty());

        //遍历collection
        for (Object obj: col) {
            System.out.println(obj);
        }
        //第二种便利迭代器
        Iterator iterator = col.iterator();
        while (iterator.hasNext()){
            Object obj2 = iterator.next();
            System.out.println(obj2);
        }
        
        //fanxing
        Integer[] intArray = {1,2,4,5,6};
        Double[] doubleArray = {1.2,1.3,1.5,1.4};
        Character[] cahrArray = {'H','E','L','L','O'};
        printArray(intArray);
        printArray(doubleArray);
        printArray(cahrArray);

        //
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);


        /////////////
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        try
        {
            FileOutputStream fileOut = new FileOutputStream("E:/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        }catch(IOException i){
            i.printStackTrace();
        }
    }

}
