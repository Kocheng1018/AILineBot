package io.kocheng.AILineBot;

import com.linecorp.bot.model.event.Event;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@LineMessageHandler
public class AiLineBotApplication {
	public static void main(String[] args) {
		System.getenv().forEach((k,v) -> {
			System.out.println(k + ": " + v);
		});
		System.out.println(System.getenv("OPENAI_API_KEY"));
		SpringApplication.run(AiLineBotApplication.class, args);
	}
}
