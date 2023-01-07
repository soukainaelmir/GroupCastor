package week_3;

public class PrimeNumber {

    public static void main(String[] args) {

        // prime numbers from 0 till 100
        // 2, 3, 5, 7 11, 13, 17, 19 23, 29 31, 37 41, 43, 47 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
        // System.out.println(isPrimeNumber(20));

    }
    private static boolean isPrimeNumber(int number){

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 ){
                count++;
            }
        }
        if (count == 2){
            return true;
        }
        return false;
    }



}
/*
1. Numbers -- Prime Number

        Write a method that can check if a number is
        prime or not

 */