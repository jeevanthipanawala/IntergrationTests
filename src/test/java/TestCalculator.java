import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestCalculator {


    private Main main;

    @BeforeEach
    void setup() {
        main = new Main();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_Addition.csv")
    public void testAddition(int addparam1,int addparam2,int result) //test Addition
    {
        int addResult=main.Add(addparam1,addparam2);
        Assertions.assertEquals(result, addResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_Substraction.csv")
    public void testSubstraction(int param1,int param2,int result) //test Addition
    {
        int subResult=main.Substract(param1,param2);
        Assertions.assertEquals(result, subResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_Multiplication.csv")
    public void testMultiplication(int param1,int param2,int result) //test Addition
    {
        int mulResult=main.Multiply(param1,param2);
        Assertions.assertEquals(result, mulResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_Division.csv")
    public void testDivision(int param1,int param2,int result) //test Addition
    {
        int divResult=main.Divide(param1,param2);
        Assertions.assertEquals(result, divResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_Modulus.csv")
    public void testmodulus(int param1,int param2,int result) //test modulus
    {
        int modulusResult=main.modulus(param1,param2);
        Assertions.assertEquals(result, modulusResult);
    }



}
