package src.sinochemcloud.duotai;

import src.sinochemcloud.Cake;

public class KindsTest {
public static void show(Animal a){
    a.eat();
    //判断类型
    if (a instanceof Cat){
        Cat c = (Cat)a;
        c.work();
    }else if (a instanceof Dog){
        Dog d = (Dog)a;
        d.work();
    }
}

    public static void main(String[] args) {
        show(new Cat());
        show(new Dog());
        Animal q = new Cat();
        q.eat();
        Cat c = (Cat)q;
        c.work();
    }
}

abstract class Animal{
    abstract void eat();
}

class Cat extends Animal{
    public void eat(){
        System.out.println("吃鱼");
    }
    public void work(){
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("吃骨头");
    }
    public void work(){
        System.out.println("抓小偷");
    }
}
