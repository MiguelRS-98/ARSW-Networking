package edu.escuelaing.arsw.URLProtocols;

import edu.escuelaing.arws.URLProtocols.URLScanner;
import java.net.MalformedURLException;
import java.net.URL;
import junit.framework.TestCase;

/**
 * This Class of test that URL Scanner.
 * @author Miguel Angel Rodriguez Siachoque
 */
public class TestURLScanner extends TestCase 
{    
    /**
     * URL protocols test. 
     */
    public void testServer1 () throws MalformedURLException 
    {
        URL site = new URL("http://ldbn.escuelaing.edu.co:80/publicaciones.pdf?vall=456r=78#publicaciones");
        URLScanner test1 = new URLScanner();
        assertEquals(test1.getProtocol(site),"http");
        assertEquals(test1.getAuthority(site),"ldbn.escuelaing.edu.co:80");
        assertEquals(test1.getHost(site),"ldbn.escuelaing.edu.co");
        assertEquals(test1.getPort(site),"80");
        assertEquals(test1.getPath(site),"/publicaciones.pdf");
        assertEquals(test1.getQuery(site),"vall=456r=78");
        assertEquals(test1.getFile(site),"/publicaciones.pdf?vall=456r=78");
        assertEquals(test1.getRef(site),"publicaciones");
    }
    /**
     * URL protocols test. 
     */
    public void testServer2 () throws MalformedURLException 
    {
        URL site2 = new URL("https://www.youtube.com/watch?v=sShbImz6U04");
        URLScanner test2 = new URLScanner();
        assertEquals(test2.getProtocol(site2),"https");
        assertEquals(test2.getAuthority(site2),"www.youtube.com");
        assertEquals(test2.getHost(site2),"www.youtube.com");
        assertEquals(test2.getPort(site2),"-1");
        assertEquals(test2.getPath(site2),"/watch");
        assertEquals(test2.getQuery(site2),"v=sShbImz6U04");
        assertEquals(test2.getFile(site2),"/watch?v=sShbImz6U04");
        assertEquals(test2.getRef(site2),null);
    }
    /**
     * URL protocols test. 
     */
    public void testServer3 () throws MalformedURLException 
    {
        URL site3 = new URL("https://campusvirtual.escuelaing.edu.co/moodle/?redirect=0");
        URLScanner test3 = new URLScanner();
        assertEquals(test3.getProtocol(site3),"https");
        assertEquals(test3.getAuthority(site3),"campusvirtual.escuelaing.edu.co");
        assertEquals(test3.getHost(site3),"campusvirtual.escuelaing.edu.co");
        assertEquals(test3.getPort(site3),"-1");
        assertEquals(test3.getPath(site3),"/moodle/");
        assertEquals(test3.getQuery(site3),"redirect=0");
        assertEquals(test3.getFile(site3),"/moodle/?redirect=0");
        assertEquals(test3.getRef(site3),null);
    }
}