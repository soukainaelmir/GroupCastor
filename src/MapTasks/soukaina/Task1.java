package MapTasks.soukaina;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

            Map<String, int[]> mapOfArray = new LinkedHashMap<>();

            int[] arr1 = {7, 8, 9, 10, 10};
            int[] arr2 = {6, 5, 5, 6, 9};
            int[] arr3 = {7, 8, 5, 8, 10};
            int[] arr4 = {6, 8, 5, 8, 9};
            int[] arr5 = {8, 9, 5, 8, 10};

            mapOfArray.put("neil", arr1);
            mapOfArray.put("soukaina", arr2);
            mapOfArray.put("youssef", arr3);
            mapOfArray.put("ziko", arr4);
            mapOfArray.put("alaya", arr5);

            for (Map.Entry<String, int[]> eachEntry : mapOfArray.entrySet()) {
                System.out.println(eachEntry.getKey() + " : " + Arrays.toString(eachEntry.getValue()));
            }


        }
    }
/*
1. Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores
 */

