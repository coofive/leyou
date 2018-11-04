package com.leyou.common.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author coofive
 *
 */
@Data
@Accessors(chain = true)
public class ResultDTO<T> {
    /**
     * 是否成功
     */
    private boolean flag;

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

}
