class Overloading {
    public int add(int a, int b) { return a + b; }
    public double add(double a, double b) { return a + b; }

    public int subtract(int a, int b) { return a - b; }
    public double subtract(double a, double b) { return a - b; }
 
    public int multiply(int a, int b) { return a * b; }
    public double multiply(double a, double b) { return a * b; }

    public int divide(int a, int b) { return a / b; }
    public double divide(double a, double b) { return a / b; }
}

    class Mainn {
    public static void main(String[] args) {
        Overloading calc = new Overloading();

        // Example method calls
        System.out.println("Addition of int: " + calc.add(5, 10));
        System.out.println("Addition of double: " + calc.add(5.5, 10.5));
        System.out.println("Multiplication of int: " + calc.multiply(3, 4));
        System.out.println("Division of double: " + calc.divide(10.0, 2.0));
    }
} 