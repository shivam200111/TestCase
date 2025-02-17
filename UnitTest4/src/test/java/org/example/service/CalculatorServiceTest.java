package org.example.service; // Same package as CalculatorService

import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeClass
    public static void init() {
        System.out.println("Before All Test Cases:");
        System.out.println("Started Test: " + new Date());
    }

    @Before
    public void beforeEach() {
        System.out.println("Before Each Test Case");
        calculatorService = new CalculatorService();  // Now it can be instantiated
    }

    @Test
    public void additionTest() {
        System.out.println("Test Case for Addition");
        int result = calculatorService.addition(12, 45);
        int expected = 57;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void subtractionTest() {
        System.out.println("Test Case for Subtraction");
        int result = calculatorService.subtraction(12, 6);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void multiplicationTest() {
        System.out.println("Test Case for Multiplication");
        int result = calculatorService.multiplication(12, 5);
        int expected = 60;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void divisionTest() {
        System.out.println("Test Case for Division");
        double result = calculatorService.division(40, 8);
        double expected = 5;
        Assert.assertEquals(expected, result, 0.001);
    }

    @Test
    public void sumTest() {
        System.out.println("Test Case for Sum of multiple numbers");
        int result = calculatorService.sumofall(2, 7, 8, 9);
        int expected = 26;
        Assert.assertEquals(expected, result);
    }

    @After
    public void afterEach() {
        System.out.println("After Each Test Case");
    }

    @AfterClass
    public static void cleanup() {
        System.out.println("After All Test Cases");
        System.out.println("End Test Cases: " + new Date());
    }
}
