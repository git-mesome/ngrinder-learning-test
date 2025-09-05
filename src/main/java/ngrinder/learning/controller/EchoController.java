package ngrinder.learning.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class EchoController {

	@PostMapping("/echo")
	public Map<String, Object> echo(@RequestBody Map<String, Object> payload) {
		return Map.of("received", payload);
	}
}