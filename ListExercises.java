import java.util.List;
import java.util.ArrayList;


public class ListExercises {
    /**
     * Returns the total sum in a list of integers
     */
    public static int sum(List<Integer> L) {
        int T = 0;
        for (int n : L) {
            T = T + n;
        }
        return T;
    }

    /**
     * Returns a list containing the even numbers of the given list
     */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> newL = new ArrayList<Integer>();
        for (int n : L) {
            if (n % 2 == 0) {
                newL.add(n);
            }
        }
        return newL;
    }

    /**
     * Returns a list containing the common item of the two given lists
     */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> newL = new ArrayList<Integer>();
        for (int n : L1) {
            for (int i : L2) {
                if (n == i) {
                    newL.add(i);
                }
            }
        }
        return newL;
    }


    /**
     * Returns the number of occurrences of the given character in a list of strings.
     */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int amount = 0;
        for (String s : words) {
            List<Character> newL = new ArrayList<Character>();
            for (int x = 0; x < s.length(); x++ ) {
                newL.add(s.charAt(x));
            }
            for (char n : newL){
                if (n == c){
                    amount++;
                }
            }
        }
        return amount;
    }
}
