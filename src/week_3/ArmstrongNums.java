package week_3;

public class ArmstrongNums {

    public static void main(String[] args) {


        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474
        // The smallest numbers which are sums of any single positive power of their digits are
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 4150, 4151, 8208, 9474

        for (int i = 1; i < 10000; i++) {
            if (isArmstrongNum(i)) {
                System.out.print(i + ", ");
            }
        }

        // System.out.println(isArmstrongNum(4150));

    }

    private static boolean isArmstrongNum(int number) {

        // 37362
        int ones = number % 10,                   // 2
                tens = number / 10 % 10,          // 6
                hundreds = number / 100 % 10,     // 3
                thousands = number / 1000 % 10;   // 7

        for (int i = 1; i < 6; i++) {
            //           7                       3                      6                   2
            if ((Math.pow(thousands, i) + Math.pow(hundreds, i) + Math.pow(tens, i) + Math.pow(ones, i) == number)) {
                return true;
            }
        }
        return false;

    }
}