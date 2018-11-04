package com.leyou.common.constants;

/**
 * 定义常见状态码
 *
 * @Author: CooFive
 * @CreateDate: 18/8/30 14:51
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public enum StatusCode {
    SUCCESS("20000", "成功"),

    FAIL("20001", "失败"),

    ACCESS_ERROR("20002", "权限不足"),

    PARAM_ERROR("20003", "参数错误"),

    NOT_FOUND("20004", "接口不存在"),

    SYSTEM_ERROR("20005", "系统异常");

    private String code;
    private String message;

    StatusCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }
}
