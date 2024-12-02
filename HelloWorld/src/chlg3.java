public class chlg3 {
    public static void main(String[] args) {
        System.out.println("Addition of Integer " + add(40, 50));
        System.out.println("Addition of doubles" + add(30.70, 60.80));

        System.out.println("multiply of integers" + multiply(30, 70));
        System.out.println("multiply of doubles" + multiply(50.0, 70.30));

        System.out.println("Subtraction of Integer " + sub(10, 20));
        System.out.println("Subtraction of doubles " + sub(10.05, 30.50));
    }

    public static int add(int a, int b) {
        return a + b; //addition
    }

    public static double add(double a, double b) {
        return a + b; //addition doubles
    }
    public static int multiply(int a, int b) {
        return a * b; //multiplication
    }
    public static double multiply(double a, double b) (
        return a * b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }

    public static double sub(double a, double b)
    {
        return a - b;
    }
}

