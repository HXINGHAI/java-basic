package src.sinochemcloud;

import java.util.Calendar;

public class Cake extends Object {   //在execise3中被调用
       private int id;
       public Cake (int id){
           this.id = id;
           System.out.println("created:" +this.id);
       }
       protected void finalize() throws java.lang.Throwable{
           super.finalize();
           System.out.println("disposed:" + this.id);
       }
}
