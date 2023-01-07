package MapTasks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeNameAndSalary {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);


        System.out.println("-----------------2.1 who has the maximum and minimum salary?-------------------------");

        Integer max = map.get("John");
        String result = "";

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() > max) {
                max = eachEntry.getValue();
                result = eachEntry.getKey();
            }

        }

        System.out.println(result);

        System.out.println("------------2.2 how many employees has the salary between 120k ~ 150K?----------------");

        // forEach loop
        AtomicInteger count = new AtomicInteger();
        map.forEach((key, value) -> {
            if (value > 120000) {
                if (value < 150000) {
                    count.getAndIncrement();
                    System.out.println(key);
                }
            }
        });
        System.out.println("count: "+count);



        /*
        // must use nested loop
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() > 120000) {
                if (eachEntry.getValue() < 150000) {
                    System.out.println(eachEntry.getKey());
                }
            }
        }

        */

        System.out.println("-------2.3 display the names of the employees who are making less than 118k?---------");

        map.forEach((k, v) -> {
            if (v < 118000) System.out.println(k);
        });

        System.out.println("Increase the salary employee by 10K if the current salary of employee is less than 120K");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (eachEntry.getValue() < 120000){
                map.replace(eachEntry.getKey(),eachEntry.getValue()+70000);
            }

        }
        System.out.println(map);


    }


}
/*
2. Given following map that contains employee name and employee salary:
	 Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

    2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K
 */