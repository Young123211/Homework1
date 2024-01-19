


//输入整数a和b，如果a 能被b整除，就输出算式和商，
// 否则输出算式、整数商和余数。（a 能被b整除即a/b=0）
import java.util.Scanner;

public class shangyushu6 {
    public static void main(String[] args) {
        //创建Scanner
        Scanner yht = new Scanner(System.in);
        // 提示用户输入整数 a
        System.out.println("请输入整数 a");
        int a = yht.nextInt();
        // 提示用户输入整数 b
        System.out.println("请输入整数 b");
        int b = yht.nextInt();
        //使用if-else
        if (b != 0) {
            if (a % b == 0) {
                System.out.println(a + "能被" + b + "整除，商为" + (a / b));
            }else{
                System.out.println(a + "不能被" + b + "整除，商为" + (a / b) + "，余数为 " + (a % b));
            }
        }else{
            System.out.println("除数不能为零,请输入非零的整数b");
        }
    }
}
