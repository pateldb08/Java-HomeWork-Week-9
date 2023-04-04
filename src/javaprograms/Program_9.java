package javaprograms;

import java.util.HashMap;
import java.util.Map;

/*
9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */
public class Program_9 {
/*
9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */
    public static void main(String[] args) {
     // Hashmap delcaration storing String keys and Integer value.
        Map<String, Integer> people = new HashMap<>();
        people.put("Darshna" , 1);
        people.put("Parita" , 2);
        people.put("Nidhi" , 3);
        people.put("Neha" , 4);
        people.put("Kinjal" , 5);

        // Enhanced for loop setting the values and printing them
        for (Map.Entry<String , Integer> list : people.entrySet()) {
            System.out.println(list.getValue() + " " + list.getKey());
        }

    }

}
