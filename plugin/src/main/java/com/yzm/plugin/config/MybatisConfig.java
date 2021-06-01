package com.yzm.plugin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yzm.plugin.mapper")
public class MybatisConfig {
}
