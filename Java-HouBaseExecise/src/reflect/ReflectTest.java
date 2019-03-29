package reflect;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author: HXH
 * @date: 2019-03-18 13:20
 * @description:对反射机制进行了大致的学习，其中一些地方还是有点不懂，有点绕
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception{
        File springFile = new File("D:\\Java-Hou\\src\\reflect\\Spring.txt");
        Properties springConfig = new Properties();
        springConfig.load(new FileInputStream(springFile));
        String ClassName = (String) springConfig.get("class");
        String MethodName = (String) springConfig.get("method");

        //根据类名称获取类对象
        Class clazz = Class.forName(ClassName);
        //根据方法名称，获取方法对象
        Method m = clazz.getMethod(MethodName);
        //获取构造器
        Constructor c = clazz.getConstructor();
        //根据构造器实例化出对象
        Object service = c.newInstance();
        //调用对象的指定方法
        m.invoke(service);

    }
}
