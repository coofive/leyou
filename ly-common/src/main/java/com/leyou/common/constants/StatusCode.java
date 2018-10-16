package com.leyou.common.constants;

/**
 * 状态码
 *
 * @Author: CooFive
 * @CreateDate: 18/8/30 14:51
 * @Version: 1.0
 * <p>Copyright: Copyright (c) 2018</p>
 */
public interface StatusCode {
    /**
     * 接口中默认变量是"public static final 类型"
     */

    /**
     * 成功
     */
    int OK = 20000;
    /**
     * 失败
     */
    int ERROR = 20001;
    /**
     * 用户名或密码错误
     */
    int LOGINERROR = 20002;
    /**
     * 权限不足
     */
    int ACCESSERROR = 20003;
    /**
     * 远程调用失败
     */
    int REMOTEERROR = 20004;
    /**
     * 重复操作
     */
    int REPERROR = 20005;
}
