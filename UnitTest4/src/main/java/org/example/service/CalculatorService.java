package org.example.service; // Package declaration

// No 'public' keyword, making it package-private
class CalculatorService {
    public int addition(int a, int b) { return a + b; }
    public int subtraction(int a, int b) { return a - b; }
    public int multiplication(int a, int b) { return a * b; }
    public double division(int a, int b) { return (double) a / b; }
    public int sumofall(int... numbers) {
        int s = 0;
        for (int n : numbers) { s += n; }
        return s;
    }
}
