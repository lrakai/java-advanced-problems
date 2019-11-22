import java.util.ArrayList;
import java.util.List;

interface Summable {
    Double sum();
}

class Numbers<T extends Number> implements Summable {
    List<T> numbers;

    public Numbers() {
        // ====================================
        // Do not change the code before this
    
        // CODE1: Write code to initialize the numbers member field 
        //        using a new ArrayList
        

        // ====================================
        // Do not change the code after this
    }

    public boolean add(T number) {
        return numbers.add(number);
    }

    // ====================================
    // Do not change the code before this
    
    // CODE2: Implement the Summable interface method
    // HINT: Use the doubleValue() method of the Number abstract class
    

    // ====================================
    // Do not change the code after this
}

public class ChallengeTwo {
    public static double sumSquared(Numbers numbers) {
        /**
         * Return Numbers sum squared (the sum multiplied by itself)
         * Arguments
         * Numbers - numbers to compute the sum squared of
         * Examples
         * Numbers<Integer>[] numbers = new Numbers<>();
         * numbers.add(1);
         * numbers.add(2);
         * double result = sumSquared(numbers); // result is 9.0
        */

        // ====================================
        // Do not change the code before this
    
        // CODE3: Write code to store the number string in a double and return the double

        
        // ====================================
        // Do not change the code after this
    }

    public static void main(String[] args) {
        Numbers<Integer> numbers = new Numbers<>();
        numbers.add(1);
        numbers.add(2);
        double result = sumSquared(numbers); // result is 9.0
        // Expected output is 
        // true
        System.out.println(result == 9.0);
    }
}