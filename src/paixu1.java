public class paixu1 {
    public static void main(String[] args) {
        int[] yht = {8, 3, 5, 2, 1};
        int temp = 0;
        for (int i = 0; i < yht.length - 1; i++) {
            for (int j = 0; j < yht.length - 1 - i; j++) {
                if (yht[j] > yht[j + 1]) {
                    temp = yht[j];
                    yht[j] = yht[j + 1];
                    yht[j + 1] = temp;
                }
            }
            for (int j = 0; j < yht.length; j++)
                System.out.print(yht[j]);

        }
    }
}//if else

