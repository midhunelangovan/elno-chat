package com.io.sas.enums;

import lombok.Getter;

@Getter
public enum ChatType {

    DIRECT("Direct"),
    GROUP("Group");

    private final String value;

    ChatType(String value) {
        this.value = value;
    }

    public static ChatType fromValue(String value) {
        for (ChatType type : ChatType.values()) {
            if (value.equalsIgnoreCase(type.value)) {
                return type;
            }
        }
        return null;
    }

}
