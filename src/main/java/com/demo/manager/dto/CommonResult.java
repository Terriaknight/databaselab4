package com.demo.manager.dto;

import org.springframework.http.HttpStatus;

import java.util.HashMap;

public class CommonResult extends HashMap<String, Object> {


    public CommonResult code(HttpStatus status) {
        this.put("code", status.value());
        return this;
    }

    public CommonResult message(String message) {
        this.put("message", message);
        return this;
    }

    public CommonResult data(Object data) {
        this.put("data", data);
        return this;
    }

    public CommonResult success() {
        this.code(HttpStatus.OK);
        return this;
    }

    public CommonResult fail() {
        this.code(HttpStatus.INTERNAL_SERVER_ERROR);
        return this;
    }

    @Override
    public CommonResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
