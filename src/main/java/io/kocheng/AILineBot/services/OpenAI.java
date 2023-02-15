package io.kocheng.AILineBot.services;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.CompletionResult;
import com.theokanning.openai.service.OpenAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OpenAI {
    private String apiKey = System.getProperty("openApiKey");

    public String askOpenAI(String question) {
        if(question.equals("")) return "no question";
        System.out.println("question is: " + question);
        OpenAiService service = new OpenAiService(apiKey);
        CompletionRequest completionRequest = CompletionRequest.builder()
                .model("text-davinci-003") // 模型
                .prompt(question) // 人的對話
                .maxTokens(500) // 上限文字(一個字一token)
                .temperature(1.2) // 溫度 他說話的隨機性
                .build();

        CompletionResult res = service.createCompletion(completionRequest);
        res.getChoices().forEach(System.out::println);
        String output = res.getChoices().get(0).getText().trim();
        return output;
    }

}
