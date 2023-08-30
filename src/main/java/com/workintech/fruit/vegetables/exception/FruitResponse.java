package com.workintech.fruit.vegetables.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FruitResponse {
    private int status;
    private String message;
    private long timmestamp;
}
