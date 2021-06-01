package com.yzm.base_2.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yzm.base_2.mapper")
public class MybatisConfig {
}
