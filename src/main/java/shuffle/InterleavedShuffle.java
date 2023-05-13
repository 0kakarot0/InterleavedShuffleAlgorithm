import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class InterleavedShuffle {
    public static void main(String[] args) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                evens.add(i);
            } else {
                odds.add(i);
            }
        }

        // Shuffle the lists of even and odd numbers
        Collections.shuffle(evens, new Random());
        Collections.shuffle(odds, new Random());

        // Interleave the two lists
        List<Integer> result = new ArrayList<>();
        while (!evens.isEmpty() || !odds.isEmpty()) {
            if (!evens.isEmpty()) {
                result.add(evens.remove(evens.size() - 1));
            }
            if (!odds.isEmpty()) {
                result.add(odds.remove(odds.size() - 1));
            }
        }

        // Print the shuffled list
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
