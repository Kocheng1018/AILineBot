package io.kocheng.AILineBot.handler;

import com.linecorp.bot.model.event.*;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import io.kocheng.AILineBot.services.OpenAI;
import org.springframework.beans.factory.annotation.Autowired;

@LineMessageHandler
public class Handler {
	@Autowired
	OpenAI ai;
	@EventMapping
	public TextMessage handleTextMessageEvent(MessageEvent<TextMessageContent> event) {
		// 這邊做的就是簡單的 echo
		String res = ai.askOpenAI(event.getMessage().getText());
		return new TextMessage(res);
	}

	@EventMapping
	public void handleDefaultMessageEvent(Event event) {
		// 就是加入聊天室, 離開聊天室, 還有一些有的沒的事件
		System.out.println("event: " + event);
	}
}
