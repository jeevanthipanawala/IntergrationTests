import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculator {


    public Main main;
    @Test
    public void testMainConstrctor()
    {
        main =new Main();

        assertNotEquals(main,null);
    }
    @Test
    public void testSub() //test sub
    {
        main=new Main();
        assertEquals(0,main.sub(2,2));
    }
    @Test
    public void testmul() // test multi
    {
        main=new Main();
        assertEquals(4,main.multi(2,2));
    }

    @Test
    public void testdivision() // test division
    {
        main=new Main();
        assertEquals(1,main.division(2,2));
    }
    @Test
    public void testmodulus() // test modulus
    {
        main=new Main();
        assertEquals(1,main.modulus(3,2));
    }
    @Test
    public void testsqurt() // test sqrt
    {
        main=new Main();
        assertEquals(2,main.squareroot(4));
    }

    @Test
    public void testabsoluteValue() // test absoluteValue
    {
        main=new Main();
        assertEquals(3,main.absoluteValue(3));
    }
    @Test
    public void testmaxValue() // test max value
    {
        main=new Main();
        assertEquals(8,main.maxValue(7,8));
    }

    @Test
    public void testminValue() // test min value
    {
        main=new Main();
        assertEquals(5,main.minValue(6,5));
    }
    @Test
    public void testrountvalue() // test round value
    {
        main=new Main();
        assertEquals(3,main.rountvalue(2.8F));
    }

    @Test
    public void TestLogarithm()
    {
        main=new Main();
        assertEquals(1,main.Logarithm(10.0F),0.0F);
    }



    

}
