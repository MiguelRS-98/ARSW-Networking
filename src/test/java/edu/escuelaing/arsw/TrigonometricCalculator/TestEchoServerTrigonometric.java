package edu.escuelaing.arsw.TrigonometricCalculator;

import edu.escuelaing.arws.TrigonometricCalculator.EchoServerTrigonometric;
import junit.framework.TestCase;

/**
 * This Class of test that Trigonometric Calculator.
 * @author Miguel Angel Rodriguez Siachoque
 */
public class TestEchoServerTrigonometric extends TestCase 
{    
    /**
     * Bye message test. 
     */
    public void testServer1 () 
    {
        EchoServerTrigonometric test1 = new EchoServerTrigonometric();
        String res1 = test1.isBye("Bye.");
        assertEquals(res1,"Respuesta de servidor: Bye.");
    }
    /**
     * Calculation message test. 
     */
    public void testServer2 () 
    {
        EchoServerTrigonometric test2 = new EchoServerTrigonometric();
        String res2 = test2.isBye("0");
        assertEquals(res2,"Cos 0.0:1.0.");
    }
    /**
     * Change funtion message test. 
     */
    public void testServer3 () 
    {
        EchoServerTrigonometric test3 = new EchoServerTrigonometric();
        String res3 = test3.isBye("fun:sin");
        assertEquals(res3,"Funtion Changed cos to sin.");
        res3 = test3.isBye("fun:cos");
        assertEquals(res3,"Funtion Changed sin to cos.");
    }
}