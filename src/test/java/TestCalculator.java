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

    /*** Parameters for all the unit tests are taken from the csv files  reside in test/resources.
     * We have only passed one set. If needed, we can add several combinations of parameters
     * to the relevant csv file and run the tests **/
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
    public void testMultiplication(int param1,int param2,int result) //test Multiplication
    {
        int mulResult=main.Multiply(param1,param2);
        Assertions.assertEquals(result, mulResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_Division.csv")
    public void testDivision(int param1,int param2,int result) //test Division
    {
        int divResult=main.Divide(param1,param2);
        Assertions.assertEquals(result, divResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_maxValue.csv")
    public void testmaxvalue(int param1,int param2,int result) //test maximum value
    {
        int maxResult=main.MaxValue(param1,param2);
        Assertions.assertEquals(result, maxResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_Modulus.csv")
    public void testmodulus(int param1,int param2,int result) //test modulus
    {
        int modulusResult=main.Modulus(param1,param2);
        Assertions.assertEquals(result, modulusResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_SquareRoot.csv")
    public void testsquareroot(int param1,int result) //test squareroot
    {
        double rootsResult=main.Squareroot(param1);
        Assertions.assertEquals(result, rootsResult);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_AbsValue.csv")
    public void testsabsolute(int param1,int result) //test absolute
    {
        int absResult=main.AbsoluteValue(param1);
        Assertions.assertEquals(result, absResult);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_minValue.csv")
    public void testminvalue(int param1,int param2,int result) //test Minimum Value
    {
        int minResult=main.MinValue(param1,param2);
        Assertions.assertEquals(result, minResult);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/TestData_roundValue.csv")
    public void testRound(float param1,int result) //test round value
    {
        int divround=main.RoundValue(param1);
        Assertions.assertEquals(result, divround);
    }





}
