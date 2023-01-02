package utils;

import java.util.ArrayList;
import java.util.Arrays;

public class task2Wed {
    public static void main(String[] args) {
        ArrayList<Integer> div15= new ArrayList<>();
        ArrayList<Integer> div5= new ArrayList<>();
        ArrayList<Integer> div3= new ArrayList<>();

        for(int i=0;i<=100;i++){
            if (i%3==0 &&i%5==0 &&i%15==0){
                div15.addAll(Arrays.asList(i));
            } else if (i%3==0 &&i%15!=0) {
                div3.addAll(Arrays.asList(i));
            } else if (i%5==0 &&i%15!=0) {
                div5.addAll(Arrays.asList(i));
            }


        }
        System.out.println("divisible by 15:"+ div15);
        System.out.println("divisible by 5:"+ div5);
        System.out.println("divisible by 3:"+ div3);

        //task




    }
}

