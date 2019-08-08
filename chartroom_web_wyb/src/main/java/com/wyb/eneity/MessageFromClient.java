package com.wyb.eneity;

import lombok.Data;

@Data
public class MessageFromClient {
    private String msg;
    private String type;
    private String to;
}

