package MapTasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EmployeeHired_Date {

    public static void main(String[] args) {


        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));

        System.out.println("-----------------Display the names of the employee who were hired before 2015-----------");
        System.out.println("Hint: You can use isBefore method of LocalDate");

        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {
            if(eachEntry.getValue().isBefore(LocalDate.of(2015,1,1))){
                System.out.println(eachEntry.getKey());
            }
        }

        System.out.println("---------------Display the name of the employee who were hired on 5/15/2020-------------\n" +
                           " Hint: You can use isEqual method of LocalDat");


        map.forEach((k,v) -> {
           if ( v.isEqual(LocalDate.of(2020, 5, 15))){
                System.out.println(k);
            }
        });

        System.out.println("--------------------How many people were hired after 2014?-------------\n" +
                             "Hint: You can use isAfter method of LocalDate");


        // Not sure what is this but it working as I want it
        //TODO var and atomic integer
        var ref = new Object() {
            int count = 0;
        };

        List<String> hiredAfter_2014 = new ArrayList<>();     // arrayList
        Map<String,LocalDate> list = new LinkedHashMap<>();    // map
        map.forEach((k, v) -> {
            if (v.isAfter(LocalDate.of(2014,12,31))) {
                hiredAfter_2014.add(k+" : "+v.getYear());    // adding to arrayList, just an extra practice
                list.put(k,v);            // adding to Map, just an extra practice
                ref.count++;   // counting

            }
        });
        System.out.println("Number of Employees hired after 2014 are : "+ref.count);
        System.out.println(hiredAfter_2014);
        System.out.println(list);

        /*
        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {
            if (eachEntry.getValue().isAfter(LocalDate.of(2014,12,31))){
                System.out.println(eachEntry.getKey());
            }

        }
        */  // for each loop


    }
}


/*
3.  Given the following map that contains the names and hired date of employees:
         Map<String, LocalDate> map = new LinkedHashMap<>();
            map.put("John", LocalDate.of(2018, 9, 5));
            map.put("Antony", LocalDate.of(2012, 7, 29));
            map.put("Jimmy", LocalDate.of(2014, 4, 1));
            map.put("James", LocalDate.of(2016, 11, 2));
            map.put("Josh", LocalDate.of(2020, 5, 15));
            map.put("Cory", LocalDate.of(2015, 6, 19));
            map.put("Anderson", LocalDate.of(2013, 8, 24));
            map.put("Steven", LocalDate.of(2017, 10, 2));

        3.1 Display the names of the employee who were hired before 2015
                    Hint: You can use isBefore method of LocalDate

        3.2 Display the name of the employee who were hired on 5/15/2020
                    Hint: You can use isEqual method of LocalDate

        3.3 How many people were hired after 2014?
                    Hint: You can use isAfter method of LocalDate

        3.4 Display the name and hire date of the employee
 */