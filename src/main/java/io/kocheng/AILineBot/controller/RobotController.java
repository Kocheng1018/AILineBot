package io.kocheng.AILineBot.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.linecorp.bot.model.event.MessageEvent;
import io.kocheng.AILineBot.handler.Handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/robot")
@RestController
public class RobotController {
	@Autowired
	Handler BotHandler;

	@GetMapping("/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>("Hello JAVA", HttpStatus.OK);
	}

//	@PostMapping("/callback")
//	public ResponseEntity<String> lineWebHook(@RequestBody MessageEvent req, @RequestBody String type) {
//		System.out.println();
//		System.out.println(req);
////		TextMessage tm = BotHandler.handleTextMessageEvent(req);
//		return new ResponseEntity<String>("", HttpStatus.OK);
//	}


}
