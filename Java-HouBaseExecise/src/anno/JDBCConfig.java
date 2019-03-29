package anno;


import java.lang.annotation.*;


/**
 * @author: HXH
 * @date: 2019-03-16 15:27
 * @description:
 */
//TODO:元注解

@Target({ElementType.METHOD,ElementType.TYPE})     //表示这个注解可以用在类/接口上，还可以用在方法上
@Retention(RetentionPolicy.RUNTIME)        //表示运行时注解，表示运行起来之后才获取注解中的相关信息
@Inherited       //表示这个子类可以被继承
@Documented   //表示运行javadoc的时候，本注解会自动生成相关文档
public @interface JDBCConfig {
    String ip();
    int port() default 3306;
    String database();
    String encoding();
    String logingName();
    String passward();
}
