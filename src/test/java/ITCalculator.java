
import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.*;

public class ITCalculator {

    private Main main;

    @BeforeEach
    void setup() {
        main = new Main();
    }

    /*** Parameters for all the integration tests are taken from the csv files reside in test/resources.**/
    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_AdditionAndMultiplication.csv")
    public void testAdditionAndMultiplication(int mulParam1, int mulParam2, int addParam, int expectedResult) {

        // Perform the multiplication and add the third parameter to the result of multiplication
        int totalResult = main.Add(main.Multiply(mulParam1, mulParam2), addParam);
        // Assert that the total result matches the expected result
        Assertions.assertEquals(expectedResult, totalResult);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_DivisionAndSubtraction.csv")
    public void testDivisionAndSubtraction(int subParam1, int subParam2, int divParam, int expectedResult) {
        // Perform the subtraction
        int subResult = main.Substract(subParam1, subParam2);
        // Perform the division with the result of subtraction
        int divResult = main.Divide(subResult, divParam);
        // Assert that the result of division matches the expected result
        Assertions.assertEquals(expectedResult, divResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_MaxAndMultiplication.csv")
    public void testMaxValueAndMultiplication(int param1, int param2, int param3, int expectedResult) {
        // Get the max value from 2 integers
        int max = main.maxValue(param1, param2);
        // Perform the division with the result of subtraction
        int mulResult = main.Multiply(max, param3);
        // Assert that the result of division matches the expected result
        Assertions.assertEquals(expectedResult, mulResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_AbsAndAddition.csv")
    public void testAbsoluteValueAndAddition(int param1, int param2,int expectedResult) {
        // Get the absolute of an integer
        int abs = main.absoluteValue(param1);
        // Add another integer to the result
        int addResult = main.Add(abs, param2);
        // Assert that the result of division matches the expected result
        Assertions.assertEquals(expectedResult, addResult);
    }
}
