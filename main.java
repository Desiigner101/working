public class main {
    public static void main(String[] args) {

        // Create an instance of Calculate with numbers and operator
        Calculate calculate = new Calculate(6, 6, '+');
        
        // Call the calculateResult method and store the result
        float result = calculate.calculateResult();
        
        // Print the result
        System.out.println("Result: " + result);
        //PAMATUUD NI GANA
    }
}
