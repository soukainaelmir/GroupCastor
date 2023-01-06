package MapTasks;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentNamesAndScores {

    public static void main(String[] args) {

        Map<String, int[]> studentScores = new LinkedHashMap<>();

        studentScores.put("Jalil", new int[]{57, 34, 34, 44, 3});
        studentScores.put("Murad", new int[]{55, 60, 70, 80, 90});
        studentScores.put("Dalila", new int[]{100, 60, 55, 78, 30});
        studentScores.put("Jamila", new int[]{99, 88, 87, 67, 95});
        studentScores.put("Halima", new int[]{98, 57, 23, 98, 12});

        studentScores.forEach((k, v) -> System.out.println(k + ": " + Arrays.toString(v)));

        // update jalil's second element in value

        //System.out.println(Arrays.toString(studentScores));


    }
}
/*
1. Create a map that can contain the student name (String) and student scores (int[]) as a pair
 (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores
 */