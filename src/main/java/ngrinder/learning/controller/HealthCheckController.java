package ngrinder.learning.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HealthCheckController {

	@GetMapping("/health")
	public Map<String, String> healthCheck() {
		return Map.of("status", "UP");
	}
}
