package com.leyou.item.web.common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 11/7/2018 10:05 PM
 */
@Configuration
@MapperScan("com.leyou.item.dao.mapper")
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        // 设置方言类型
        page.setDialectType("mysql");
        return page;
    }
}
