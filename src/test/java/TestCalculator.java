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

    /*** Parameters for all the unit tests are taken from the csv files reside in test/resources.
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







}
