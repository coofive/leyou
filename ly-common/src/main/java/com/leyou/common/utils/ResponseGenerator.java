package com.leyou.common.utils;

import com.leyou.common.constants.StatusCode;
import com.leyou.common.dto.ResultDTO;

/**
 * @author coofive
 * @version : 1.0.0
 * @date : 11/4/2018 10:00 AM
 */
public class ResponseGenerator {

    /**
     * 返回成功
     *
     * @param <T> 指定泛型
     * @return 返回ResultDTO
     */
    public static <T> ResultDTO<T> success() {
        return new ResultDTO<T>()
                .setFlag(true)
                .setCode(StatusCode.SUCCESS.code())
                .setMessage(StatusCode.SUCCESS.message());
    }

    /**
     * 返回成功和数据
     *
     * @param data 数据
     * @param <T>  指定泛型
     * @return 返回ResultDTO
     */
    public static <T> ResultDTO<T> success(T data) {
        return new ResultDTO<T>()
                .setFlag(true)
                .setCode(StatusCode.SUCCESS.code())
                .setMessage(StatusCode.SUCCESS.message())
                .setData(data);
    }

    /**
     * 返回失败和描述
     *
     * @param <T> 指定泛型
     * @return 返回ResultDTO
     */
    public static <T> ResultDTO<T> fail(String message) {
        return new ResultDTO<T>()
                .setFlag(false)
                .setCode(StatusCode.FAIL.code())
                .setMessage(StatusCode.FAIL.message());
    }

    /**
     * 返回自定义失败和描述
     *
     * @param statusCode 自定义状态和描述
     * @param <T>        指定泛型
     * @return 返回ResultDTO
     */
    public static <T> ResultDTO<T> fail(StatusCode statusCode) {
        return new ResultDTO<T>()
                .setFlag(false)
                .setCode(statusCode.code())
                .setMessage(statusCode.message());
    }
}
