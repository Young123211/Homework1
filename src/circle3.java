public class circle3 {
    public static void main(String[]args){
        double r = 2.23;
        double h = 2.24;
        double C = 2*3.14*r;//圆周长
        double S1 = 3.14*(r+r);//圆面积
        double S2 = 4*3.14*r*r;//球表面积
        double V1 = 4/3*(3.14*r*r*r);//球体积
        double V2 = (3.14*r*r)*h;//圆柱体积
     //   System.out.print("圆周长是"+C+"\n"+"圆面积是"+S1+"球表面积是"+S2+"球体积是"+V1+"圆柱体积是"+V2);
        System.out.println("圆周长是"+C);//ln自带换行
        System.out.print("圆周长是"+C);
        //保留两位小数
        //System.out.printf()
        //静态保留，做一套静态的，研究别的位数




    }
}
