public class Main {
    public static void main(String[] args) {
        double first = 12;
        double second = 4;

        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println("Numbers: " + first + " and " + second);
        System.out.println("Addition: " + calculator.calculate(first, second));

        calculator.setStrategy(new SubtractStrategy());
        System.out.println("Subtraction: " + calculator.calculate(first, second));

        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplication: " + calculator.calculate(first, second));

        calculator.setStrategy(new AddStrategy());
        System.out.println("Back to addition: " + calculator.calculate(first, second));
    }
}
