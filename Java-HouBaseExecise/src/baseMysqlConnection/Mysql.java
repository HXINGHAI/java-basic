package baseMysqlConnection;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class Mysql {
    static final String JDBCNAME = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/ginmysql?useSSL=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "123456";

    public static void main(String[] args) {
        //获取输入值
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {

            Connection conn = null;
            Statement state = null;
            try {
                Class.forName(JDBCNAME);
                System.out.println("链接数据库。。。。");
                conn = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("实例化statement对象");
                state = conn.createStatement();
                String sql = String.format("SELECT * FROM student WHERE id = %d",scan.nextInt());
                ResultSet rs = state.executeQuery(sql);

                while (rs.next()) {
                    int ID = rs.getInt("id");
                    String username = rs.getString("user_name");
                    String sex = rs.getString("user_sex");
                    int age = rs.getInt("user_age");
                    Date time = rs.getDate("created_time");
                    System.out.println(ID + " 姓名为：" + username + " 性别为:" + sex + " 岁数为："+age+" 注册时间："+time);
                }
                rs.close();
                conn.close();
                state.close();

            } catch (SQLException E) {
                E.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (state != null) {
                        state.close();
                    }
                } catch (SQLException se2) {
                    //啥都不干
                }
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException se3) {
                    //啥都不干
                }
            }
        }
    }
}
