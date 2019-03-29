public class HomeWork {

    //打印菱形的函数
    public static void shapeOfRhombus(int n){
        if (n <= 1){
            System.out.println("参数错误！");
            return;
        }
//上层
        for (int i = 1; i <= n;i++){
            for(int j = 1;j<= n-i;j++){  //找出上面的空格的规律
                System.out.printf(" ");
            }
            for(int m = 1; m <= 2*i-1;m++){
                System.out.printf("-");
            }
            System.out.printf("\n");
        }
        //下层
        for(int i = 1;i<=n-1;i++){
            for (int j = 1;j<= i;j++){
                System.out.printf(" ");
            }
            for (int m = 1;m<= 2*(n-1-i+1)-1;m++){
                System.out.printf("-");
            }
            System.out.printf("\n");
        }
    }

    //打印矩形的函数
    public static void shapeOfRectangle(int length,int height){
        for(int i = 1; i <= length;i++){
            for (int j = 1; j <= height; j++){
                System.out.printf(" -");
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        shapeOfRhombus(4);
        shapeOfRectangle(5,5);

        //冒泡排序
        int[] array = {45,3,23,76,33,21,9,12};
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] >= array[j+1]){
                    int team = array[j];
                    array[j] = array[j+1];
                    array[j+1] = team;
                }
            }
        }
        for (int element:array) {
            System.out.println(element);
        }
    }
}
