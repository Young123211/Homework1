import java.util.Scanner;

public class StitchCase4{
    public static void main(String[]args) {
        //创建Scanner对象
        Scanner yht = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = yht.nextInt();

        //判断整数的位数
        int weiShu = 0;
        int temp = num;

        while (temp != 0) {
            temp = temp / 10;
            weiShu++;
        }

        System.out.println("整数的位数为: " + weiShu);
        //正序输出
        int temp2 = num;
        int posi;
        for(int i = 1 ; i<=weiShu ; i++){
            posi = temp%10;
            switch (i) {
            case 1:
                System.out.println("个位数: " + posi);
                break;
            case 2:
                System.out.println("十位数: " + posi);
                break;
            case 3:
                System.out.println("百位数: " + posi);
                break;

            }




    }
}}