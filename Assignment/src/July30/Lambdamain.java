package July30;

public class Lambdamain{


        public static void main(String[] args) {
            // Create a lambda expression implementing the Icalculate interface
            Icalculate calculateLambda = (a, b) -> a + b;

            // Use the lambda expression and print the result
            int result = calculateLambda.add(5, 3); // Pass two integers as arguments
            System.out.println(result); // Outputs: 8
        }
    }

