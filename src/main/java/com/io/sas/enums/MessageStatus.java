package com.io.sas.enums;

import lombok.Getter;

@Getter
public enum MessageStatus {

    SENT("Sent"),
    DELIVERED("Delivered"),
    READ("Read");

    private final String value;

    MessageStatus(String value) {
        this.value = value;
    }

    public static MessageStatus fromValue(String value) {
        for (MessageStatus status : MessageStatus.values()) {
            if (value.equalsIgnoreCase(status.getValue())) {
                return status;
            }
        }
        return null;
    }

}