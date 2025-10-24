public class Calculator {
    
    //calculation for Addition
    public int add(int a, int b) {
        return a + b;
    }
    //calculation for Subtraction
    public int sub(int a, int b) {
        return a - b;
    }
    //calculation for Multiplication
    public int mul(int a, int b) {
        return a * b;
    }
    //calculation for Dividing
    public int div(int a, int b) {
        return a / b;
    }
    //calculation for Power
    public int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }
    //calculation for Percentage
    public double per(double a, double b) {
        return (a / 100) * b;
    }
    
    public double sqrt(double a) {
        if (a < 0) throw new IllegalArgumentException("Sqr Undefined negitive number :(");
        return Math.sqrt(a);
    }

}