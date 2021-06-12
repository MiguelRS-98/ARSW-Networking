package edu.escuelaing.arsw.SquareNumber;

import edu.escuelaing.arws.SquareNumber.EchoServerSquare;
import junit.framework.TestCase;

/**
 * This Class of test that Square Numbers.
 * @author Miguel Angel Rodriguez Siachoque
 */
public class TestEchoServerSquare extends TestCase
{
    /**
     * Bye message test. 
     */
    public void testServer1 () 
    {
        EchoServerSquare test1 = new EchoServerSquare();
        String res1 = test1.isBye("Bye.");
        assertEquals(res1,"Respuesta de servidor: Bye.");
    }
    /**
     * Square message test. 
     */
    public void testServer2 () 
    {
        EchoServerSquare test2 = new EchoServerSquare();
        String res2 = test2.isBye("2");
        assertEquals(res2,"El cuadrado de 2: 4.0.");
    }
    /**
     * Square message test. 
     */
    public void testServer3 () 
    {
        EchoServerSquare test3 = new EchoServerSquare();
        String res3 = test3.isBye("5");
        assertEquals(res3,"El cuadrado de 5: 25.0.");
    }
}