import java.util.Scanner;

public class StitchCase4 {
    public static void main(String[]args){
        // t
        Scanner yht = new Scanner(System.in);
        System.out.println("请输入一个一位到三位的整数");
        int num = yht.nextInt();
        if(num>=0&&num<=10){
            num=1;
        }else if(num>10&&num<=99){
            num=2;
            
        }else if(num>=100&&num<1000){
            num=3;
        }

        switch(num){
            case 1 :System.out.println("一位整数");
            break;//忘记break了
            case 2 :System.out.println("二位整数");
            break;
            case 3 :System.out.println("三位整数");

        }//对数字进行一个解析，数字单独输出，嵌套循环
        //先正序输出每一位，再逆序







    }
}
