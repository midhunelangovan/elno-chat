package com.io.sas.enums;

import lombok.Getter;

@Getter
public enum MessageType{
    TEXT("Text"),
    IMAGE("Image"),
    FILE("File"),
    SYSTEM("System");

    private final String value;

    MessageType(String value) {
        this.value = value;
    }

    public static MessageType fromValue(String value){
        for(MessageType type : MessageType.values()){
            if(value.equalsIgnoreCase(type.getValue())){
                return type;
            }
        }
        return null;
    }

}