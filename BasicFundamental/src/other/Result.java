package other;
import java.util.*;

class Result {
    public static int lastRemaining(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        boolean leftToRight = true;
        
        while (numbers.size() > 1) {
            List<Integer> newNumbers = new ArrayList<>();
            
            if (leftToRight) {
                for (int i = 0; i < numbers.size(); i += 2) {
                    newNumbers.add(numbers.get(i));
                }
            } else {
                for (int i = numbers.size() - 1; i >= 0; i -= 2) {
                    newNumbers.add(numbers.get(i));
                }
                Collections.reverse(newNumbers);
            }
            
            numbers = newNumbers;
            leftToRight = !leftToRight;
        }
        
        return numbers.get(0);
    }

    public static void main(String[] args) {
        int n = 9; // Change this value to test with different numbers
        System.out.println("Last remaining number: " + lastRemaining(n));
    }
}
