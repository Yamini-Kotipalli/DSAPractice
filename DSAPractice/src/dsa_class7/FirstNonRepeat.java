package dsa_class7;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeat {

    public static void main(String[] args) {

        String s = "aashique";

        Map<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find the first character whose frequency is 1
        for (int i = 0; i < s.length(); i++) {

            if (map.get(s.charAt(i)) == 1) {

                System.out.println("Index : " + i);
                return;
            }
        }

        System.out.println("No element");
    }
}