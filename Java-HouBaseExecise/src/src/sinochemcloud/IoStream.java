package src.sinochemcloud;

import java.io.*;

public class IoStream {
    public static void main(String[] args) throws IOException {
//        String c;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        //读取字符串
//        do {
//            c = br.readLine();         //readLine()是读取字符串，read()是读取一个字符  注意区分；
//            System.out.println(c);
//        }while(!c.equals("hxh"));
//
//
           //创建文件对象
        File f = new File("E:/hxh.txt");
        InputStream out = new FileInputStream(f);
        for (int i = 0 ;i < out.available();i++){
            System.out.print((char)out.read());
        }

        File file = new File("E:/HXH.txt");
        FileOutputStream fop = new FileOutputStream(f);
        OutputStreamWriter write = new OutputStreamWriter(fop,"UTF-8");
        write.append("中华能源科技");
        write.append("\r\n");
        write.append("English");
        write.close();     //关闭写入流，并且将上面的缓存写入文件中
        fop.close();    //关闭输出流，释放系统资源
        FileInputStream fip = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(fip,"UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            sb.append((char) reader.read());
        }
        System.out.println(sb.toString());
        reader.close();      //关闭读取流
        fip.close();          //关闭输入流


    }
}
