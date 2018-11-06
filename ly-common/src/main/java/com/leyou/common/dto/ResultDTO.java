package com.leyou.common.dto;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author coofive
 * @version : 1.0.0
 */
@Data
@Accessors(chain = true)
@ToString
public class ResultDTO<T> {
    /**
     * 是否成功
     */
    private boolean flag;

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

}
