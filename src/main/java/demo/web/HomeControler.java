package demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler {

	@Value("${conference.name:devoxx}")
	private String conference;
	
	@Secured("ROLE_HERO")
	@RequestMapping("/")
	public String home() {
		return "Hello "+conference;
	}

//	@RequestMapping("/hello")
//	public void hello(@RequestParam String name) {
//		return "Hello again, $name");
//	}
}