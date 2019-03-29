package src.sinochemcloud.duotai;

public class AbsJiChengTest extends AbsTest{

    private double salay;
    public AbsJiChengTest(String name,String sex,int nums,double salay){
        super(name, sex, nums);
        setSalay(salay);
    }
    public void mailCheck(){
        System.out.println("Checked result is that:"+this.getName()+this.getSex()+salay);
    }
    public double getSalay(){
        return this.salay;
    }
    public void setSalay(double newSalay){
        if (newSalay >= 0.0){
            this.salay = newSalay;
        }
    }
    public double computePay(){
        System.out.println("目标是："+ getName());
        return this.salay/52;
    }
}
