package MapTasks;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentsNames {

    public static void main(String[] args) {


        String[] group1 = {"John", "Antony", "Jimmy", "Jalil", "James"};
        String[] group2 = {"Conor", "Josh", "Cory", "Anderson", "Steven"};
        String[] group3 = {"Ddene", "Winfred", "Jereme", "Glad", "Desirae"};
        String[] group4 = {"Kakalina", "Bertrando", "Ajay", "Brigitte"};
        String[] group5 = {"Derk", "Orlando", "Selle", "Marika"};

        // Create a map that contains group id and names of group members
        // Map<Integer, String[]> groups = new LinkedHashMap();

        Map<Integer, String[]> groups = new LinkedHashMap<>();

        // Add all the group 1d and group members into the map named groups
        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(3, group3);
        groups.put(4, group4);
        groups.put(5, group5);

        System.out.println("------------------Display the names of each student with group id of 1-------------\n");

        for (String eachStudent : groups.get(1)) {
            System.out.println(eachStudent);
        }
        System.out.println("---------------Display the names of each student from each groups -------------");

        groups.forEach((k , v) -> {
            System.out.println("----Group: "+k+" ----");
            for (String each : v) {
                System.out.println(each);
            }
        });

    }
}
/*
4. Given the following arrays that contains the names of the students from each group:
	        String[] group1 = {};
	        String[] group2 = {};
	        String[] group3 = {};
	        String[] group4 = {};
	        String[] group5 = {};

	    4.1 Create a map that contains group id and names of group members

	            Map<Integer, String[]> groups = new LinkedHashMap();

	        add all the group 1d and group members into the map named groups

	    4.2 Display the names of each student with group id of 1

	    4.3 Display the names of each student from each groups
 */