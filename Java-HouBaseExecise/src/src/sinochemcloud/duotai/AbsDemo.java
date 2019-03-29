package src.sinochemcloud.duotai;

public class AbsDemo {
    public static void main(String[] args) {
//        AbsTest b = new AbsTest()        //直接引用抽象类的对象是会报错的
        //也就是抽象类的对象不能实例化  （抽象类用在继承）

        AbsJiChengTest s = new AbsJiChengTest("janny","woman",14250,259.26);
        AbsTest a = new AbsJiChengTest("xiaoming","man",1452,205.2);
          s.mailCheck();
          ((AbsJiChengTest) a).mailCheck();
    }
}
