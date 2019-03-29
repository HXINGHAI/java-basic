package src.sinochemcloud;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {

    //类变量
    static int classValue = 0;
    String str = "Hello World";    //实例变量


    public void test(){
        int age = 0;       //不赋值会报初始化错误
        age = age + 7;
        System.out.println("小明的年龄：" + age);
    }

    public String name;       //这个实例变量对子类可见
    private double salary;    //私有变量，仅在本类可见

    private static double salary2;   //静态的私有实例变量
    public static final String USER = "开发人员";   // 常量
    //构造方法
    public Exercise1(String newName){
        this.name = newName;
    }
    //设定值
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void printValue(){
        System.out.println("名字:" + this.name);
        System.out.println("薪水:" + this.salary);
    }


    public static void main(String[] args) {
        System.out.println("Hello World Java");
        //方法调用
        Student t1 = new Student("LiHua");
        Student t2 = new Student("Janny");
        t1.stuAge(23);
        t1.stuNumber(1407020104);
        t1.println();

        t2.age = 24;
        t2.number = 1407020106;
        t2.println();

        //int基本类型的取值范围
        System.out.println("int 的二进制位数："+ Integer.SIZE);
        System.out.println("包装类：Java.lang.Integer");
        System.out.println("最小值："+Integer.MIN_VALUE);
        System.out.println("最大值："+Integer.MAX_VALUE);

        //java常量
        final Double PI = 3.1415926;    //一般用final修饰常量，并且常量使用大写字母
        int a = 24;    //局部变量
        int b = 6;
        byte f = 44;
        char c = 'A';
        int d = c;
        //类型转换
        System.out.println((byte)a + " 自动类型转换：" + d);
        System.out.println("计算的值为"+ (c+a));

        //局部变量Test的调用
        Exercise1 test1 = new Exercise1("aa");
        test1.test();
        //实例变量的使用
        Exercise1 test2 = new Exercise1("noob");
        test2.setSalary(299.5);
        test2.printValue();

        //私有静态变量的调用
        salary2 = 12000;
        System.out.println(USER+"工资"+salary2);

        //计算数值的使用
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (a / b) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );

        int x = 2*++a;
        int y = 2*b++;
        System.out.println("数值为：" + x);
        System.out.println("数值为：" + y);

        //逻辑运算符
        boolean g = true;
        boolean h = false;
        System.out.println(g&&h);
        System.out.println(g||h);
        System.out.println(!g&&h);
        //条件运算符
        int p,q;
        p = 4;
        q = (p == 4)? 30:40;
        System.out.println(q);

        //instanceof运算符  //检查类类型或者接口类型是否是特定的类型
        String str = "name";
        boolean result = str instanceof String;
        System.out.println(result);
        //while 循环
        while (p != 0){
            System.out.println("p的值为："+p);
            p--;
        }
        //do-while循环
        int cp = 5;
        do {
            System.out.println("do-while cp的值："+cp);
            cp--;
        }while (cp > 1);

        //for循环
        for (int i = 0; i < 4; i++) {
            System.out.println("for循环的值"+i);
        }
        //增强型循环  用于数组的遍历
        String[] stringArray = {"a","b","c","d","e"};
        for (String element:stringArray){
            if(element == "c"){
                continue;
            }
            if(element == "d")
            {
                break;
            }
            System.out.println(element);
        }
        //switch-case语句
        char ch = 'D';
        switch (ch){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                break;
            case 'C':
                System.out.println("良好");
            default:
                System.out.println("还行吧");
        }
        //Number类
        Integer co = 6;
        co = co +4;
        System.out.println(co);
        //Math类
        System.out.println("pi/2的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("PI/2的角度值：" + Math.toDegrees(Math.PI/2));

        String str3 = "1434";
        int br = Integer.parseInt(str3);   //Number子类Integer的调用
        System.out.printf("%d\n",br);     //说明br是int型
        String str4 = Integer.toString(br);
        System.out.printf("%s\n",str4);   //说明str4是字符串
        //character类
        //装箱
        Character cha = 'a';
        boolean result2 = Character.isUpperCase(cha);   //Character的方法，检查字符是否大写
        System.out.println(cha+1 + "结果：" + result2);
        //转义字符
        System.out.println("\"java的学习之路\"");
        //String类
        char[] helloArray = {'a','b','v','c','g'};
        String heoolString = new String(helloArray);
        System.out.println(heoolString);
        System.out.println("字符串的长度：" +heoolString.length());
        //连接字符串的另一个方法
        String str5 = "efghi";
        System.out.println("拼接后的样子："+ heoolString.concat(str5));
        //StringBuffer和StringBuilder类
        StringBuffer str6 = new StringBuffer("青島java學習之路");
        str6.append("www.");
        str6.append("baidu.");
        str6.append("com");
        System.out.println(str6);
        //数组的申明和定义
        int size = 5;
        String[] dataArray = new String[size];
        dataArray[0] = "ABC";
        dataArray[1] = "DEF";
        dataArray[2] = "GHI";
        dataArray[3] = "JKL";
        dataArray[4] = "MNO";
//        dataArray[5] = "ABC";     //抛出数组越界错误
        for(String elementdata : dataArray){
            System.out.println(elementdata);
        }
        //调用student类中的数组函数测试
        int[] data2Array = {1,3,4,5};
        Student arrayTest = new Student("arrayTest");
        int[] receivedArray = arrayTest.arrayFunction(data2Array);
        for (int dataelement : receivedArray) {
            System.out.println(dataelement);
        }
        //多维数组
        String[][] sArray =new String[2][];
        sArray[0] = new String[2];      //为最高维分配引用空间
        sArray[1] = new String[3];
        sArray[0][0] = new String("Good");
        sArray[0][1] = new String("Luck");
        sArray[1][0] = new String("to");
        sArray[1][1] = new String("you");
        sArray[1][2] = new String("!");

        //日期的格式化输出
        Date date = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        System.out.println(sm.format(date));
        System.out.printf("全部日期和时间信息：%tc%n",date);
        System.out.printf("年-月-日格式：%tF%n",date);
        System.out.printf("月/日/年格式：%tD%n",date);
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
        System.out.printf("HH:MM格式（24时制）：%tR\n",date);

        String str7 = String.format(Locale.US,"英文月份%tb",date);
        System.out.println(str7);
        //程序休眠
        try{
            System.out.println(new Date());
            Thread.sleep(1000*2);
            System.out.println(new Date());
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("got an exception");
        }
        //测量时间间隔
        try {
            long start = System.currentTimeMillis();
            System.out.println(new Date());
            Thread.sleep(1000*3);
            System.out.println(new Date());
            long end = System.currentTimeMillis();
            long dif = end - start;
            System.out.println("时间间隔为：" + dif);
        }catch (Exception e1){
            System.out.println("抛出异常");
        }

        //Calendar类的创建
        Calendar ca = Calendar.getInstance();
        System.out.println(ca);
        //创建一个指定日期的Calendar
        ca.set(2018,6,12);
        System.out.println(ca);
        int year = ca.get(Calendar.YEAR);
        int week = ca.get(Calendar.DAY_OF_WEEK);
        System.out.println(year +week);


        String[] months = {"Jan","Feb","Mar","Apr","May","Jul","Aug","Sep","Oct","Nov","Dec"};
        GregorianCalendar gca = new GregorianCalendar();
        //显示当前日期时间
        int years = gca.get(Calendar.YEAR);
        System.out.print(years);
        System.out.print(months[gca.get(Calendar.MONTH)]);
        System.out.print(gca.get(Calendar.DATE));
        //显示时分秒
        System.out.print(gca.get(Calendar.HOUR));
        System.out.print(gca.get(Calendar.MINUTE));
        System.out.print(gca.get(Calendar.SECOND));
        //判断是否是闰年
        if(gca.isLeapYear(years)){
            System.out.println("是闰年！");
        }else{
            System.out.println("不是闰年！");
        }
        //正则表达式
        String contex = "I am a member of sinochem,and form Qingdao";
        boolean isMatch = Pattern.matches(".*sinochem.*",contex);
        System.out.println("是否包含？" + isMatch);

        //捕获组
        String line = "This order is replaced for QT3000! OK?";
        Pattern pattern = Pattern.compile("(\\D*)(\\d+)(.*)");
        Matcher m = pattern.matcher(line);
        System.out.println(m.groupCount());
        if(m.find()){
            System.out.println(m.group(0));   //代表整个表达式
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
        }else{
            System.out.println("No Match");
        }
        //Matcher 类的start方法和end方法
        Pattern ps = Pattern.compile("\\bcat\\b");
        Matcher ms = ps.matcher( "cat cat cat cattie cat"); // 获取 matcher 对象
        int count = 0;
        while(ms.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+ms.start());
            System.out.println("end(): "+ms.end());
        }
    }
}
