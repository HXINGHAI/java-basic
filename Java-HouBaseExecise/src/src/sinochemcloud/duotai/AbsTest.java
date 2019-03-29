package src.sinochemcloud.duotai;

import src.sinochemcloud.Abstract.AbstractClass;

public abstract class AbsTest {
    private String name;
    private String sex;
    private int nums;

    public AbsTest(String name,String sex,int nums){
        this.name = name;
        this.sex = sex;
        this.nums = nums;
    }
    public double computePay(){
        return 0.0;
    }
    public void mainCheck(){
        System.out.println("Checks is that :" + this.name+this.nums+this.sex);
    }
    public String toString(){
        return  name +" "+ nums+ " "+sex;
    }
    public String getName(){
        return this.name;
    }
    public String getSex(){
        return this.sex;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getNums(){
        return this.nums;
    }
}
