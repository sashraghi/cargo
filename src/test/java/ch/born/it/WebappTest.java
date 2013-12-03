package ch.born.it;

import junit.framework.TestCase;

import java.net.URL;
import java.net.HttpURLConnection;

/**
 * Integration test class
 * @author ashraghi
 *
 */
public class WebappTest extends TestCase {
	
	/**
	 * this is the first integration test
	 * @throws Exception
	 */
	public void testCallIndexPage() throws Exception {
		
		URL url = new URL("http://localhost:8080/ezbank");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.connect();
		assertEquals(200, connection.getResponseCode());
	}
}
