package MapTasks;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class CarMap {

    public static void main(String[] args) {

        //4. Given the following maps that contains the different car informations:

        Map<String, Object> car1 = new Hashtable<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 55000);
        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        Map<String, Object> car4 = new Hashtable<>();
        car4.put("brand", "Honda");
        car4.put("model", "Accord");
        car4.put("color", "Black");
        car4.put("year", 2012);
        car4.put("price", 10000);
        car4.put("electric", false);

        Map<String, Object> car5 = new Hashtable<>();
        car5.put("brand", "Toyota");
        car5.put("model", "Camry");
        car5.put("color", "Grey");
        car5.put("year", 2015);
        car5.put("price", 13500);
        car5.put("electric", false);

        Map<String, Object> car6 = new Hashtable<>();
        car6.put("brand", "Nissan");
        car6.put("model", "Murano");
        car6.put("color", "Blue");
        car6.put("year", 2015);
        car6.put("price", 17000);
        car6.put("electric", false);

        Map<Integer, Map<String, Object>> myCars = new Hashtable<>();
        myCars.put(1, car1);
        myCars.put(2, car2);
        myCars.put(3, car3);
        myCars.put(4, car4);
        myCars.put(5, car5);
        myCars.put(6, car6);
/*
        myCars.forEach((k, v) -> {
            for (Map.Entry<String, Object> each : v.entrySet()) {

                boolean b = each.getKey().equals("brand");
                boolean m = each.getKey().equals("model");
                boolean p = each.getKey().equals("price");

                if (b) {
                    System.out.print(each.getValue() + " : ");
                }
                if (p) {
                    System.out.print(each.getValue() + " : ");
                }
                if (m) {
                    System.out.print(each.getValue() + " : ");
                }

                System.out.println(each.getKey());
            }
        });

 */


        System.out.println("------------Display the brand-model-price of each car-------------");
        // Im still struggling with this task

        for (Map.Entry<Integer, Map<String, Object>> eachEntry : myCars.entrySet()) {

            String result = "";
            for (Map.Entry<String, Object> each : eachEntry.getValue().entrySet()) {

                if (each.getKey().equals("model") || each.getKey().equals("brand") || each.getKey().equals("price")) {

                    result += each.getValue() + " : ";
                }
            }
            System.out.println(result);
        }

        System.out.println("----------Display all the electric cars--------------");

        for (Map.Entry<Integer, Map<String, Object>> eachEntry : myCars.entrySet()) {
            for (Map.Entry<String, Object> each : eachEntry.getValue().entrySet()) {
                if(each.getKey().equals("electric")){
                    if ((Boolean) each.getValue() == true){
                        System.out.println(eachEntry.getValue().get("brand") +"  " +eachEntry.getValue().get("model"));
                    }
                }
            }
        }


        // Extra practice // Display all the electric cars
        var ref = new Object(){  // var can replace almost any data type
            String result = "";
        };

        myCars.forEach((key, value) -> {

            value.forEach((k,v)-> {
                if (k.equals("electric")){
                    if ((Boolean)v == true){
                       ref.result += value.get("brand")+" "+ value.get("model");

                    }
                }
            });
        });
        System.out.println(ref.result);

        System.out.println("-------------------4.4 Display the most expensive car-----------------------");

        var var = new Object(){
            Integer max = (Integer) myCars.get(1).get("price");;
            String result = "";
        };

        //Integer max = (Integer) myCars.get(1).get("price");

        myCars.forEach((key, value) -> {
            if ((Integer)value.get("price") > var.max){
                var.max = (Integer) value.get("price");
                var.result = value.get("brand") + " "+ value.get("model");

            }
        });
        System.out.println(var.result);


    }
}
/*
 (Create 3 more map objects and store 3 different car informations in them)

        4.1 Create a map named myCars that takes car number as a key and car info as a value
        Hint: key of the map need to be integer and value of the map need to be a map with String as key and Object as value

        4.2 Display the brand-model-price of each car

        4.3 Display all the electric cars

        4.4 Display the most expensive car
 */