package com.io.sas.model;


import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Chat {

    private UUID id;
    private String type;
    private String name;
    private String description;

}
