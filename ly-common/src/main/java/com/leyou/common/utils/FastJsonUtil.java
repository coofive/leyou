package com.leyou.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author wenwu.liu.o
 */
public class FastJsonUtil {
    private static final Logger log = LoggerFactory.getLogger(FastJsonUtil.class);

    /**
     * 将object序列化成jsonString
     *
     * @param obj
     * @return
     */
    public static String objectToJson(Object obj) {
        return JSON.toJSONString(obj);
    }

    /**
     * 将jsonString 反序列化成object
     *
     * @param jsonString
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T jsonToObject(String jsonString, Class<T> tClass) {
        T t = null;
        try {
            t = JSON.parseObject(jsonString, tClass);
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return t;
    }

    /**
     * 将jsonString 反序列化成object
     *
     * @param jsonString
     * @param type
     * @param <T>
     * @return
     */
    public static <T> T jsonToObject(String jsonString, TypeReference<T> type) {
        T t = null;
        try {
            t = JSON.parseObject(jsonString, type);
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return t;
    }


    /**
     * 将jsonString 解析成为一个 List<JavaBean> 及 List<String>
     *
     * @param jsonString
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> List<T> jsonToList(String jsonString, Class<T> tClass) {
        List<T> t = new ArrayList<>();
        try {
            t = JSON.parseArray(jsonString, tClass);
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return t;
    }


    /**
     * 将jsonString 解析成为一个Map
     *
     * @param jsonString
     * @return
     */
    public static Map jsonToMap(String jsonString) {
        Map map = null;
        try {
            map = JSON.parseObject(jsonString, Map.class);
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return map;
    }


    /**
     * 将jsonString 解析成 List<Map<String,Object>>
     *
     * @param jsonString
     * @return
     */
    public static List<Map<String, Object>> jsonToListMap(String jsonString) {
        List<Map<String, Object>> list = new ArrayList<>();
        try {
            list = JSON.parseObject(jsonString, new TypeReference<List<Map<String, Object>>>() {
            });
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return list;
    }
}