package com.Three.AiChatBot;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder chatClient) {
        this.chatClient = chatClient.build();
    }



//    @GetMapping("/")
//    public String prompt(@RequestParam String m) {
//        return chatClient.prompt()
//                .user(m)
//                .call()
//                .content();
//    }

    @GetMapping("/")
    public String prompt(@RequestParam(defaultValue = "Hello") String m) {
        return chatClient.prompt().user(m).call().content();
    }

//    @Controller
//    public class ErrorRedirectController {
//        @RequestMapping("/error")
//        public String handleError() {
//            return "Please use /?m=your-message to interact with the AI.";
//        }
//    }



}
