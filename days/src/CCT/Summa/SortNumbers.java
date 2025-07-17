package CCT.Summa;
import java.util.*;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] parts = input.trim().split("[,\\s]+");

        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                numbers.add(Integer.parseInt(part));
            }
        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}