import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SherlockAnagrams {

    public SherlockAnagrams() {}

    public static int computeAnagrams(String s) {
        // Code V2
        char[] letters = s.toCharArray();

        int numAnagrams = 0;
        Map<String, Integer> anagramsMap = new HashMap<>();

        for (int i = 0; i < letters.length; i ++) {
            int[] charFrequencies = new int[26];

            for (int j = i; j < letters.length; j ++) {
                charFrequencies[(int) letters[j] - 97] ++;

                StringBuilder anagram = new StringBuilder();
                for (int n : charFrequencies) {anagram.append(n);}

                String representation = anagram.toString();
                int numMatches = anagramsMap.getOrDefault(representation, 0);

                if (numMatches == 0) {
                    anagramsMap.put(representation, 1);
                } else {
                    numAnagrams += numMatches;
                    anagramsMap.put(representation, numMatches + 1);
                }
            }
        }

        return numAnagrams;

        /*
        // Code V1
        int numAnagrams = 0;
        char[] letters = s.toCharArray();

        for (int i = 0; i < letters.length; i ++) { // O(N)
            // System.out.println("i: " + i);
            Map<Character, Integer> charMap = new HashMap<>();

            for (int length = 1; i + length < letters.length; length ++) { // O(N^2)
                // System.out.println("\tlength: " + length);
                charMap.put(letters[i + length - 1],
                        charMap.getOrDefault(letters[i + length - 1], 0) + 1);

                // System.out.print("\tCharMap: ");
                // System.out.println("\t" + charMap);

                // check if any of the rest are the same
                Map<Character, Integer> matchMap = new HashMap<>(charMap);
                // System.out.println("MatchMap: " + matchMap);

                for (int k = i; k + length < letters.length; k ++) {  // O(N^3)?
                    // k - 1 is the one to remove, k + length is the one to add
                    // map spans from (k, k + length]
                    // System.out.println("\t\tChar to remove: " + letters[k]);
                    int newValue = matchMap.get(letters[k]) - 1;
                    if (newValue == 0) {
                        matchMap.remove(letters[k]);
                    } else {
                        matchMap.put(letters[k], newValue);
                    }
                    matchMap.put(letters[k + length],
                            matchMap.getOrDefault(letters[k + length], 0) + 1);

                    // System.out.println("\t\tMatchMap: " + matchMap);
                    if (charMap.equals(matchMap)) {
                        numAnagrams ++;
                        // System.out.println("\t\tMatch! Num anagrams: "
                        //         + numAnagrams);
                    }
                }
            }
        }
        return numAnagrams;


         */

    }
}
