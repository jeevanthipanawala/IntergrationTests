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
    public void testSub()
    {
        main=new Main();
        assertEquals(0,main.sub(2,2));
    }
    @Test
    public void testmul()
    {
        main=new Main();
        assertEquals(4,main.multi(2,2));
    }

}
