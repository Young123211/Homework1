import java.util.Scanner;

public class paixu1 {
    public static void main(String[] args) {
        //创建Scanner，让用户输入
        Scanner yht = new Scanner(System.in);
        //用户输入的第一个数
        System.out.println("请输入第一个整数");
        int num1 = yht.nextInt();
        //输入的第二个数
        System.out.println("请输入第二个整数");
        int num2 = yht.nextInt();
        //输入第三个整数
        System.out.println("请输入第三个整数");
        int num3 = yht.nextInt();
        if(num1<=num2&&num1<=num3){
            if (num2<=num3){
                System.out.println("从小到大的顺序为："+num1+"\t"+num2+"\t"+num3);
            }else{
                System.out.println("从小到大的顺序为："+num1+"\t"+num3+"\t"+num2);
            }
        }else if (num2<=num1&&num2<=num3){
            if (num1<=num3){
                System.out.println("从小到大的顺序为："+num2+"\t"+num1+"\t"+num3);
            }else{
                System.out.println("从小到大的顺序为："+num2+"\t"+num3+"\t"+num1);
            }
        }else if (num3<=num1&&num3<=num2){
            if (num1<=num2){
                System.out.println("从小到大的顺序为："+num3+"\t"+num1+"\t"+num2);
            }else{
                System.out.println("从小到大的顺序为："+num3+"\t"+num2+"\t"+num1);
            }
    }
}
}


