package com.hw.businessserviceuser.enumration;

import lombok.Getter;

/**
 * @Description TODO
 * @Author hw
 * @Date 2019/2/26 17:08
 * @Version 1.0
 */
@Getter
public enum StatusEnum {

    OK((byte) 1, "启用"),
    FREEZED((byte) 2, "冻结"),
    DELETE((byte) 3, "删除");

    private Byte code;

    private String message;

    StatusEnum(Byte code, String message) {
        this.code = code;
        this.message = message;
    }
}
