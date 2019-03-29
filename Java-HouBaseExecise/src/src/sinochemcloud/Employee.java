package src.sinochemcloud;

/**
 * @author: HXH
 * @date: 2019-03-13 17:59
 * @description:
 */
public class Employee implements java.io.Serializable{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}
