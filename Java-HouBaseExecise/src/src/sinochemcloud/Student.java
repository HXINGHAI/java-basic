
package src.sinochemcloud;

public class Student {
    String username;
    int age;
    int number;
    //构造方法（传参）
    public Student(String name){
        this.username = name;
//          System.out.println("学生的名字是:" + name);
    }
    public void stuAge(int stuage){
        age = stuage;
    }
    public void stuNumber(int stunum){
        number = stunum;
    }
//    public static void main(String[] args){
//        Student s = new Student("Sinochem");
//        Stua
//    }
    public void println(){
        System.out.println("学生的名字：" + username);
        System.out.println("学生的年龄：" + age);
        System.out.println("学生的学号：" + number);
    }

    //定义测试数组作为返回值的函数
    public static int[] arrayFunction(int[] array){//倒序输出数组
        int[] result = new int[array.length];
        for (int i = 0,j = result.length-1; i < result.length; i++,j--) {
                 result[j] = array[i];
        }
        return result;
    }
}


