package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        //MathOperation addition = new Addition();
        // Using a lambda expression instead of implementing the interface via a class
        MathOperation addition = (a, b) -> a + b;
        StringOperation toUpper = s -> s.toUpperCase();

        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println(toUpper.apply("daniel"));
    }
}
