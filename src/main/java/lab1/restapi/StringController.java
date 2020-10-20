package lab1.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
	@GetMapping("/revertString")
	public String testController() {
		return "Hello world test";
	}
}
