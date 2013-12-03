package ch.born.test;

import ch.born.EchoService;
import junit.framework.TestCase;

/**
 * Unitest class
 * @author ashraghi
 *
 */
public class EchoServiceTest extends TestCase
{
    /**
     * unitest 
     */
    public void testDoTesting()
    {
        EchoService echoService = new EchoService();
        assertEquals("Hello World!", echoService.sendMessage());
    }
    
     /**
     * unitest
     */
    public void testDoTestingAgain()
    {
        EchoService echoService = new EchoService();
        boolean result = "HELLO WORLD!".equals(echoService.sendMessage());
        assertFalse(result);
    }
}
