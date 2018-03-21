package com.yom.designpatterns.behavioral.chain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Request {

    private RequestType requestType;
    private String message;
}
