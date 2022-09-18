package Netology.part2.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut " +
            "enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
            " aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit " +
            "in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur " +
            "sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt " +
            "mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < lorem.length(); i++) {
            if (Character.isLetter(lorem.charAt(i))) {
                char ch = lorem.toLowerCase().charAt(i);
                if (map.get(ch) == null) {
                    map.put(ch, 1);
                } else {
                    int chNum = map.get(ch);
                    map.put(ch, chNum + 1);
                }
            }
        }
        int max = -1;
        char chMax = 0;
        for (Map.Entry<Character, Integer> ci : map.entrySet()) {
            if (ci.getValue() > max) {
                max = ci.getValue();
                chMax = ci.getKey();
            }
        }
        System.out.println(chMax + "-met:" + max);

        int min = Integer.MAX_VALUE;
        char chMin = 0;
        for (Map.Entry<Character, Integer> ci : map.entrySet()) {
            if (ci.getValue() < max) {
                min = ci.getValue();
                chMin = ci.getKey();
            }
        }
        System.out.println(chMin + "-met:" + min);
    }
}


