package src.sinochemcloud.javajicheng;


class SuperClass{
    private int n;
    SuperClass(){
        System.out.println("SuperClass");
    }
    SuperClass(int n){
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}

class SubClass extends SuperClass{
    private int n;
    SubClass(){//自动调用父类的无参构造器
        System.out.println("SubClass");
    }

    SubClass(int n){
        super(300);//super调用父类的构造器
        System.out.println("SubClass(int n)");
        this.n = n;
    }
}

class SubClass2 extends SuperClass{
    private int n;
    public SubClass2(){// 调用父类中带有参数的构造器
        super(300);
        System.out.println("SubClass2");
    }
    public SubClass2(int n){// 自动调用父类的无参数构造器
        System.out.println("Subclass2(int n)");
        this.n = n;
    }
    }

public class Gozaoqi {
    public static void main(String[] args) {
        SubClass sub1 = new SubClass();
        SubClass sub2 = new SubClass(222);
        SubClass2 sub3 = new SubClass2();
        SubClass2 sub4 = new SubClass2(333);
    }
}
