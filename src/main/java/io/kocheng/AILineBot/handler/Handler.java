package io.kocheng.AILineBot.handler;

import com.linecorp.bot.model.event.*;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
import lombok.Value;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.concurrent.ExecutionException;

@LineMessageHandler
public class Handler {
	@EventMapping
	public TextMessage handleTextMessageEvent(MessageEvent<TextMessageContent> event) {
		// 這邊做的就是簡單的 echo
		System.out.println("event: ?" + event);
		return new TextMessage(event.getMessage().getText() + "i am test");
	}

	@EventMapping
	public void handleDefaultMessageEvent(Event event) {
		// 就是加入聊天室, 離開聊天室, 還有一些有的沒的事件
		System.out.println("event: " + event);
	}
}
