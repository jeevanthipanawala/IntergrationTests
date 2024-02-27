
import org.example.Main;
import org.junit.Assert;
import org.junit.Test;
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
}
