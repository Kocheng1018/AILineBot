package io.kocheng.AILineBot.controller;

import io.kocheng.AILineBot.services.OpenAI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/robot")
@RestController
public class RobotController {
	@Autowired
	OpenAI ai;

	@GetMapping("/test")
	public ResponseEntity<String> test(@RequestParam(required = false, defaultValue = "") String question ) {
		System.out.println("question is: " + question);
		return new ResponseEntity<String>(ai.askOpenAI(question), HttpStatus.OK);
	}

}
