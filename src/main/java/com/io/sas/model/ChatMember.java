package com.io.sas.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class ChatMember {

    private UUID id;
    private UUID uuId;
    private UUID chatId;
    private UUID userId;
    private String userRole;
    private LocalDateTime joinedAt;
    private LocalDateTime leftAt;
    private boolean isActive;

}
