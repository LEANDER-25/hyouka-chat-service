package com.hyouka.demo.hyoukachatting.common;

import java.util.HashMap;
import java.util.Map;

public enum STATUS {
    READ,
    UNREAD,
    SENDING,
    SENT;

    private Map<String, STATUS> enumMap = new HashMap<>();

    static {

    }
}
