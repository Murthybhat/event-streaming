package com.murthy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class Message implements Serializable {

    private static final String MESSAGE_FORMAT = "Q: %s \nA: %s";

    private String user;
    private String payload;

    @Override
    public String toString() {
        return String.format(MESSAGE_FORMAT, this.user, this.payload);
    }
}
