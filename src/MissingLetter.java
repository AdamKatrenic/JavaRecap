import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingLetter {
    
    public static char findMissingLetter(char[] array) {
        Set<Character> letters = IntStream.range(0, array.length)
                .mapToObj(i -> array[i])
                .collect(Collectors.toSet());

        char firstLetter = array[0];
        char lastLetter = array[array.length - 1];

        for (char c = firstLetter; c <= lastLetter; c++) {
            if (!letters.contains(c)) {
                return c;
            }
        }

        throw new IllegalArgumentException("No missing letter found");

  }

}
