package MapTasks.soukaina;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
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

        Map<Integer,Map<String,Object>> myCars = new LinkedHashMap<>();
        myCars.put(1,car1);
        myCars.put(2,car2);
        myCars.put(3,car3);

        for (Map.Entry<Integer, Map<String, Object>> eachEntry : myCars.entrySet()) {
            System.out.println(eachEntry.getValue().get("brand") +"-"+ eachEntry.getValue().get("model") +"-"+ eachEntry.getValue().get("price"));

        }






    }
}
/*
4. Given the following maps that contains the different car informations:

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

        (Create 3 more map objects and store 3 different car informations in them)

        4.1 Create a map named myCars that takes car number as a key and car info as a value
        		Hint: key of the map need to be integer and value of the map need to be a map with String as key and Object as value

		4.2 Display the brand-model-price of each car

		4.3 Display all the electric cars

		4.4 Display the most expensive car


 */

