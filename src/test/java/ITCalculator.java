
import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ITCalculator {
    public Main main;

    @Test
    public void testSubAndAdd() //test sub
    {
        main=new Main();
        int addResult=main.add(5,5);
        int subResult=main.sub(addResult,4);
        assertEquals(6,subResult);
    }
}
