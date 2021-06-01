package com.yzm.type_handler.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yzm.type_handler.mapper")
public class MybatisConfig {
}
