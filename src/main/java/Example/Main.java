package Example;


public class Main {
    public static void main(String[] args) {
        Calculator1 calculator = new calculator();

        System.out.println("Addition: " + calculator.add(2, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(4, 2));
        System.out.println("Division: " + calculator.divide(10, 2));
    }
}
