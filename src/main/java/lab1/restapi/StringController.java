package lab1.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
	@GetMapping("/rev")
	public String revertStringEndpoint(@RequestParam(value = "stringToRevert") String stringToRevert){
		return stringToRevert;
	}

	public String revertString(String stringToRevert){
		StringBuilder revertedString = new StringBuilder();
		for (int letterIndex = stringToRevert.length() - 1; letterIndex >= 0 ; letterIndex--) {
			revertedString.append(stringToRevert.charAt(letterIndex));
		}
		return revertedString.toString();
	}

}
