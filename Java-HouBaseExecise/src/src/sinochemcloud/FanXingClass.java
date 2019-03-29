package src.sinochemcloud;

/**
 * @author: HXH
 * @date: 2019-03-14 09:59
 * @description:
 */
public class FanXingClass <B> {
    private B b;
    public void add(B b){
        this.b = b;
    }
    public B getB(){
        return b;
    }

    public static void main(String[] args) {
        FanXingClass<Integer> integerFanXingClass = new FanXingClass<>();
        FanXingClass<String> stringFanXingClass = new FanXingClass<>();
        integerFanXingClass.add(3);
        stringFanXingClass.add("String");
        System.out.println("整型为："+integerFanXingClass.getB());
        System.out.println("字符串为"+stringFanXingClass.getB());
    }
}
