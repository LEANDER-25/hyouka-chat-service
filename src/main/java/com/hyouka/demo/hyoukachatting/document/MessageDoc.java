package com.hyouka.demo.hyoukachatting.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "messages")
public class MessageDoc extends BaseDocument {
    private UserDoc sender;
    private UserDoc receiver;
    private String content;
}
