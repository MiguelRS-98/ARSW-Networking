package edu.escuelaing.arsw.AppBrowser;

import edu.escuelaing.arws.AppBrowser.URLReader;
import java.net.MalformedURLException;
import java.net.URL;
import junit.framework.TestCase;

/**
 * This Class of test that URL Reader.
 * @author Miguel Angel Rodriguez Siachoque
 */
public class TestURLReader extends TestCase 
{
    /**
     * URL protocols test. 
     */
    public void testServer1 () throws MalformedURLException
    {
        URL site = new URL("http://google.com/");
        URLReader test1 = new URLReader();
        assertEquals(test1.readURL(site),true);
    }
    /**
     * URL protocols test. 
     */
    public void testServer2 () throws MalformedURLException
    {
        URL site = new URL("https://www.facebook.com/");
        URLReader test1 = new URLReader();
        assertEquals(test1.readURL(site),true);
    }
    /**
     * URL protocols test. 
     */
    public void testServer3 () throws MalformedURLException
    {
        URL site = new URL("https://www.youtube.com/");
        URLReader test1 = new URLReader();
        assertEquals(test1.readURL(site),true);
    }
}