package com.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/*
1,整合mybatis-Plus
    1）导入依赖
    2）配置，参照mybatis-Plus官方文档
        1,配置属数据源，
            导入数据库驱动
            在application.yml配置数据源相关信息
        2,配置mybatis-plus
            使用mapperscan
            告诉mybatis plus 映射文件位置

    3）
 */
@EnableDiscoveryClient
@MapperScan("com.mall.product.dao")
@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
