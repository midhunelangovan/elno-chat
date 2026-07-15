package com.io.sas.model;


import com.io.sas.enums.MessageStatus;
import com.io.sas.enums.MessageType;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Message {

    private UUID id;
    private UUID chatId;
    private UUID senderId;
    private String content;
    private MessageType type;
    private MessageStatus status;
    private String replyToMessageId;
    private boolean edited;
    private boolean deleted;


}
