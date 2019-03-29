package src.sinochemcloud.Abstract;


public class Shapes extends AbstractClass{//子类不是抽象类，子类则需要重写父类中的所有抽象方法
    public Shapes(int bottom, int height) {

        super(bottom, height);         //利用super
    }
    @Override//注释作用，让系统自动检测下面的方法名是否是父类中的
    public void getLength(){
        int length = (bottom+height)*2;
        System.out.println("周长是" +length);
    }
    @Override
    public void getArea(){
        int area = bottom*height;
        System.out.println("面积是：" +area);
    }

    public static void main(String[] args) {
        Shapes shape = new Shapes(2,3);
        shape.getArea();
        shape.getLength();

        //测试instanceof
        boolean result = shape instanceof Shapes;    //如果兼容该类也返回true
        System.out.println(result);
    }

}