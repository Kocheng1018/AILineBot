package io.kocheng.AILineBot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/robot")
@RestController
public class RobotController {

	@GetMapping("/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>("Hello JAVA", HttpStatus.OK);
	}
}
