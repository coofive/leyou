package com.leyou.common.constants;

/**
 * 定义常见状态码
 *
 * @author coofive
 * @version : 1.0.0
 * @date : 18/8/30 14:51
 */
public enum StatusCode {
    /**
     * 成功
     */
    SUCCESS("20000", "成功"),

    /**
     * 失败
     */
    FAIL("20001", "失败"),

    /**
     * 权限不足
     */
    ACCESS_ERROR("20002", "权限不足"),

    /**
     * 参数错误
     */
    PARAM_ERROR("20003", "参数错误"),

    /**
     * 接口不存在
     */
    NOT_FOUND("20004", "接口不存在"),

    /**
     * 系统异常
     */
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
