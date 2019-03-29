package src.sinochemcloud.javajiekou;

import java.util.Enumeration;
import java.util.Vector;

public class PersonInterfaceTest implements PersonOfInterface{
    @Override
    public void studying(){
        System.out.println("I am studying");
    }
    @Override
    public void working(){
        System.out.println("I am working");
    }

    public static void main(String[] args) {
        PersonInterfaceTest s = new PersonInterfaceTest();
        s.studying();
        s.working();
    }
}
