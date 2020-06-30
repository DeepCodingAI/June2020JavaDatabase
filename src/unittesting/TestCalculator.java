package unittesting;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class TestCalculator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Calculator calculator = new Calculator();
        int expectedAdditionResult = calculator.addition(10,15);
        System.out.println(expectedAdditionResult);
        int actualAdditionResult = 25;
        Assert.assertEquals(actualAdditionResult, expectedAdditionResult);

        int expectedSubtractionResult = calculator.subtraction(20,12);
        System.out.println(expectedSubtractionResult);
        int actualSubtractionResult = 8;
        Assert.assertEquals(expectedSubtractionResult, actualSubtractionResult);

        String fullName = calculator.getFullName("Rodham");
        Assert.assertEquals(fullName,"Rodham Clinton");
        System.out.println(fullName);

    }
}
