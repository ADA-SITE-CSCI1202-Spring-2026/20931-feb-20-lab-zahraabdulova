import java.util.Arrays;

public class SortString {

    public static String sort(String str) {
        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }

    public static void main(String[] args) {
        String word = "Baku";

        String result = sort(word);

        System.out.println("Original: " + word);
        System.out.println("Sorted: " + result);
    }
}
