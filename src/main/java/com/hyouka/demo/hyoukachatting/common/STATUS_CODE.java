package com.hyouka.demo.hyoukachatting.common;

public enum STATUS_CODE {
    NOT_FOUND_CODE(404, "Not Found"),
    BAD_REQUEST_CODE(400, "Bad Request"),
    SERVER_ERROR_CODE(500, "Server Error");

    private int code;
    private String desc;

    STATUS_CODE(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
