package src.sinochemcloud.javajicheng;

public class Animal {
    private String name;
    private int id;
    public Animal(String name,int id){
        this.name = name;
        this.id = id;
    }
    public void doing(){
        System.out.println(name + "正在吃");
    }
    public void runing(){
        System.out.println("小伙伴"+id +"正在吃");
    }
}

class Monkey extends Animal{
    public Monkey(String name,int id){
        super(name,id);
    }
}