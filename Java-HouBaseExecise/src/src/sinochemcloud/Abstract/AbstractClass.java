package src.sinochemcloud.Abstract;

public abstract class AbstractClass {
    public int bottom;
    public int height;
    //构造方法
    public AbstractClass(int bottom,int height){
         // super();
        this.bottom = bottom;
        this.height = height;
    }
    public abstract void getLength();
    public abstract void getArea();
}




