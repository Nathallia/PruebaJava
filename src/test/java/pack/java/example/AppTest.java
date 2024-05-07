package pack.java.example;

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
    public void shouldAnswerWithTrue()
    {
        Long result = pack.java.CountMatches.CountFromString( "asasb","[a|b]");
        assertTrue( result > 0 );
    }
}
