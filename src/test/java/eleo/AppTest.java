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
    public void twotimestwo()
    {
        int num1 = 2;
        int num2 = 2;
        int total = num1 * num2;
        if(total == 4)
        {
            assertTrue(true);
        }
    }
    @Test
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
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
