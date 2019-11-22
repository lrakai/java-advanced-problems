import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Formattable {
    String format(String input);
}

public class ChallengeThree {
    public static List<String> topSalaryReport(List<Employee> employees, int top, Formattable formatter) {
        /**
         * Returns a List<String> storing the names of top highest income with their names formatted by
         * formatter. The highest earner should be first in the list, followed by the 2nd highest, etc.
         * Use Streams, Collectors, and Lambdas to implement the function.
         * Arguments
         * employees - list of employees to find the highest income earners
         * top - the number of employees to include in the output list
         * formatter - a formatter to format the names of the employees
         * Examples
         * ArrayList<Employee> employees = new ArrayList<Employee>();
         * employees.add(new Employee("Sam Thane", 55000));
         * employees.add(new Employee("Judy Diaz", 90000));
         * employees.add(new Employee("Mark Bourne", 85000));
         * topSalaryReport(employees, 2, s -> s.toUpperCase()).stream().forEach(System.out.println(x));
         * Outputs
         * JUDY DIAZ
         * MARK BOURNE
         */

        // ====================================
        // Do not change the code before this
    
        // CODE1: Write code to return the described top salary list using Streams, Collectors, and Lambdas
        // HINT: You can use sorted((e1, e2) -> Integer.compare(e2.salary, e1.salary)) in your stream 
        //       pipeline to sort descending by salary
        
    
        // ====================================
        // Do not change the code after this
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Sam Thane", 55000));
        employees.add(new Employee("Judy Diaz", 90000));
        employees.add(new Employee("Mark Bourne", 85000));
        topSalaryReport(employees, 2, s -> s.toUpperCase()).stream().forEach(System.out::println);
        // Expected output is 
        // JUDY DIAZ
        // MARK BOURNE
    }
}

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}