package MapTasks.soukaina;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task4 {

        public static void main(String[] args) {
            String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis" };
            String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif"};
            String[] group3 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan"};
            String[] group4 = {"Maria","Kristina","Amin","George","Layan","Amin"};
            String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir"};

            Map<Integer, String[]> groups = new LinkedHashMap<>();
            groups.put(1,group1);
            groups.put(2,group2);
            groups.put(3,group3);
            groups.put(4,group4);
            groups.put(5,group5);

            for (Map.Entry<Integer, String[]> eachEntry : groups.entrySet()) {
                if( eachEntry.getKey()==1){
                    System.out.println((Arrays.toString(eachEntry.getValue())));
                }
            }

            System.out.println("-----------------------------------------");
            for (Map.Entry<Integer, String[]> eachEntry : groups.entrySet()) {
                System.out.println((Arrays.toString(eachEntry.getValue())));
            }


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

