package com.hyouka.demo.hyoukachatting.controller;

import com.hyouka.demo.hyoukachatting.common.exception.BadRequestException;
import com.hyouka.demo.hyoukachatting.document.MessageDoc;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/message")
    @SendTo("/chatroom/public")
    public MessageDoc receivePublicMessage(@Payload MessageDoc messageDoc) {
        return messageDoc;
    }

    @MessageMapping("/private-message")
    public MessageDoc receivePrivateMessage(@Payload MessageDoc messageDoc) {
        if (Objects.isNull(messageDoc)) {
            throw new BadRequestException();
        }
        String receiver = Strings.EMPTY;
        if (Objects.nonNull(messageDoc.getReceiver())) {
            receiver = messageDoc.getReceiver().getUsername();
        }
        if (Strings.isBlank(receiver)) {
            throw new BadRequestException();
        }
        simpMessagingTemplate.convertAndSendToUser(receiver, "/private", messageDoc);
        return messageDoc;
    }
}
