package com.leyou.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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

    /*==============================json to object=======================================*/

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
        List<T> list = null;
        try {
            list = JSON.parseArray(jsonString, tClass);
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return list;
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
        List<Map<String, Object>> list = null;
        try {
            list = JSON.parseObject(jsonString, new TypeReference<List<Map<String, Object>>>() {
            });
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return list;
    }

    /*==============================jsonObject to object=======================================*/

    /**
     * 将jsonObject 解析成object
     *
     * @param jsonObject
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T jsonObjectToObject(JSONObject jsonObject, Class<T> clazz) {
        T t = null;
        try {
            t = jsonObject.toJavaObject(clazz);
        } catch (Exception e) {
            log.info("jsonObject解析出错：" + jsonObject, e);
        }
        return t;
    }

    /**
     * 将jsonObject 解析成list
     *
     * @param jsonObject
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> jsonObjectToList(JSONObject jsonObject, Class<T> clazz) {
        List<T> list = null;
        try {
            list = jsonToList(JSON.toJSONString(jsonObject), clazz);
        } catch (Exception e) {
            log.info("jsonObject解析出错：" + jsonObject, e);
        }
        return list;
    }

    /**
     * 将jsonObject 解析成map
     *
     * @param jsonObject
     * @return
     */
    public static Map jsonObjectToMap(JSONObject jsonObject) {
        Map map = null;
        try {
            map = jsonObject.toJavaObject(Map.class);
        } catch (Exception e) {
            log.info("jsonObject解析出错：" + jsonObject, e);
        }
        return map;
    }


    /*==============================json to object by key=======================================*/

    /**
     * 将jsonString 取出对应key的jsonObject
     *
     * @param jsonString
     * @param key
     * @return
     */
    public static JSONObject getAsJSONObject(String jsonString, String key) {
        JSONObject jsonObject = null;
        try {
            jsonObject = JSON.parseObject(jsonString).getJSONObject(key);
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return jsonObject;
    }

    /**
     * 将jsonString 取出对应key的jsonArray
     *
     * @param jsonString
     * @param key
     * @return
     */
    public static JSONArray getAsJSONArray(String jsonString, String key) {
        JSONArray jsonArray = null;
        try {
            jsonArray = JSON.parseObject(jsonString).getJSONArray(key);
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return jsonArray;
    }

    /**
     * 将jsonString 取出对应key的String
     *
     * @param jsonString
     * @param key
     * @return
     */
    public static String getAsString(String jsonString, String key) {
        String str = null;
        try {
            str = JSON.parseObject(jsonString).getString(key);
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return str;
    }

    /**
     * 将jsonString 取出对应key的Integer
     *
     * @param jsonString
     * @param key
     * @return
     */
    public static Integer getAsInteger(String jsonString, String key) {
        Integer integer = null;
        try {
            integer = JSON.parseObject(jsonString).getInteger(key);
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return integer;
    }

    /**
     * 将jsonString 取出对应key的Long
     *
     * @param jsonString
     * @param key
     * @return
     */
    public static Long getAsLong(String jsonString, String key) {
        Long aLong = null;
        try {
            aLong = JSON.parseObject(jsonString).getLong(key);
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return aLong;
    }

    /**
     * 将jsonString 取出对应key的Double
     *
     * @param jsonString
     * @param key
     * @return
     */
    public static Double getAsDouble(String jsonString, String key) {
        Double aDouble = null;
        try {
            aDouble = JSON.parseObject(jsonString).getDouble(key);
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return aDouble;
    }

    /**
     * 将jsonString 取出对应key的指定类型
     *
     * @param jsonString
     * @param key
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T getAsObject(String jsonString, String key, Class<T> clazz) {
        T t = null;
        try {
            t = JSON.parseObject(jsonString).getObject(key, clazz);
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return t;
    }

    /**
     * 将jsonString 取出对应key指定类型的list
     *
     * @param jsonString
     * @param key
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> getAsList(String jsonString, String key, Class<T> clazz) {
        List<T> list = null;
        try {
            list = JSON.parseObject(jsonString).getObject(key, new TypeReference<List<T>>() {
            });
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return list;
    }

    /**
     * 将jsonString 取出对应key的map
     *
     * @param jsonString
     * @param key
     * @return
     */
    public static Map getAsMap(String jsonString, String key) {
        Map map = null;
        try {
            map = JSON.parseObject(jsonString).getObject(key, Map.class);
        } catch (Exception e) {
            log.info("json解析出错：" + jsonString, e);
        }
        return map;
    }

    /*==============================jsonMap to object=======================================*/

    /**
     * 将jsonMap 通过key取出Object
     *
     * @param map
     * @param key
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T getAsObjectFromMap(Map map, String key, Class<T> clazz) {
        T t = null;
        try {
            t = JSONObject.toJavaObject((JSON) map.get(key), clazz);
        } catch (Exception e) {
            log.info("jsonMap解析出错：" + map, e);
        }
        return t;
    }

    /**
     * 将jsonMap 通过key取出List
     *
     * @param map
     * @param key
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> getAsListFromMap(Map map, String key, Class<T> clazz) {
        List<T> list = null;
        try {
            JSON json = (JSON) map.get(key);
            list = jsonToList(JSON.toJSONString(json), clazz);
        } catch (Exception e) {
            log.info("jsonMap解析出错：" + map, e);
        }
        return list;
    }

    /**
     * 将jsonMap 通过key取出List
     *
     * @param map
     * @param key
     * @return
     */
    public static Map getAsMapFromMap(Map map, String key) {
        Map result = null;
        try {
            result = JSONObject.toJavaObject((JSON) map.get(key), Map.class);
        } catch (Exception e) {
            log.info("jsonMap解析出错：" + map, e);
        }
        return result;
    }
}
