package mysqlConnection;

import anno.JDBCConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author: HXH
 * @date: 2019-03-16 15:25
 * @description:
 */
@JDBCConfig(ip = "localhost",database = "ginmysql",encoding = "UTF-8",logingName = "root",passward = "123456")
public class DBUtil {
    static final String JDBCNAME = "com.mysql.jdbc.Driver";
    static {
        try{
            Class.forName(JDBCNAME);   //获取类对象
         //  Class s1 =  DBUtil.class;
          // Class s2 =  new DBUtil().getClass();   //获取类对象的其他两种方式
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException,NoSuchMethodException,SecurityException {
        JDBCConfig config = DBUtil.class.getAnnotation(JDBCConfig.class);   //反射
        //解析获得注解对象
        String ip = config.ip();
        int port = config.port();
        String database = config.database();
        String encoding = config.encoding();
        String logingName = config.logingName();
        String passward = config.passward();

        String url = String.format("jdbc:mysql://%s:%d/%s?useSSL=false&serverTimezone=UTC&characterEncoding=%s",ip,port,database,encoding);
        return DriverManager.getConnection(url,logingName,passward);
    }

    public static void main(String[] args)throws NoSuchMethodException, SecurityException, SQLException  {
        Connection c = getConnection();
        System.out.println(c.toString());
        System.out.println("连接成功！");


    }
}
