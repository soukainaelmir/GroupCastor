package week_3;


import java.util.Random;

public class ReverseNegativeNums {

    public static void main(String[] args) {

        //System.out.println(reverseNegativeNumbers(-369));

        // generate random numbers
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            int numbers = -100+ random.nextInt((150) );
            System.out.println(numbers + " --> " + reverseNegativeNumbers(numbers));
        }

    }

    private static int reverseNegativeNumbers(int number) {

        if (number < 0) {
            String str = Math.abs(number) + "";
            String[] array = str.split("");
            String reversed = "";

            for (int i = array.length - 1; i >= 0; i--) {
                reversed += array[i];
            }
            return Integer.parseInt(reversed);
        }
        return number;


    }


}
