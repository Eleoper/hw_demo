package eleo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void 2times2()
    {
        int num1 = 2;
        int num2 = 2;
        int total = num1 * num2;
        if(total == 4)
        {
            assertTrue(true);
        }
    }

    public void oneplusone()
    {
        int num1 = 1;
        int num2 = 2;
        int total = num1 + num2;
        if(total == 2)
        {
            assertTrue(true);
        }
    }

    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
