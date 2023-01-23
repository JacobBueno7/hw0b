import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> newMap = new HashMap<>();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for (int x = 0; x < 26; x++){
            newMap.put(alpha.charAt(x), x+1);
        }
        return newMap;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> newMap = new HashMap<>();
        for (int i : nums){
            newMap.put(i, i*i);
        }
        return newMap;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> newMap = new TreeMap<>();
        for (String i : words){
            int counter = 0;
            for (String h : words){
                if (i == h) {
                    counter++;
                }
            }
            newMap.putIfAbsent(i, counter);
        }
        return newMap;
    }

    public static void main(String[] args) {
        List<String> newL = new ArrayList<String>();
        newL.add("yes");
        newL.add("butt");
        newL.add("butt");
        newL.add("noob");
        newL.add("noob");
        newL.add("butt");

        System.out.println(countWords(newL));
    }
}