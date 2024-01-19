import java.util.Scanner;

public class circle3{
    public static void main(String[] args){
        //创建Scanner
        Scanner yht = new Scanner(System.in);
        System.out.println("请输入圆的半径:");
        double r = yht.nextDouble();
        System.out.println("请输入圆柱的高:");
        double h = yht.nextDouble();
        //计算圆周长
        double C = 2 * 3.14 * r;
        //计算圆面积
        double S1 = 3.14 * r * r;
        //计算圆球表面积
        double S2 = 4 * 3.14 * r * r;
        //计算圆球体积
        double V1 =(4.0/3.0) * 3.14 * r * r * r;
        //计算圆柱体积
        double V2 = S1 * h;
        //输出结果，保留两位小数
        //System.out.printf();
        //System.out.printf();
      //  System.out.printf();
        //System.out.printf();
        //System.out.printf();
    }
}
