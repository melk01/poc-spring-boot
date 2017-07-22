package demo.web;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class HomeControllerIntegrationTest {
	
	@Value("${local.server.port}")
	private int port;
	
	@Test
	public void runAndInvokeHome(){
		String url = "http://localhost:"+port+"/";
		String body = new TestRestTemplate("hero","hero").getForObject(url, String.class);
		Assert.assertTrue(body.equals("Hello mohamed"));
	}

}
