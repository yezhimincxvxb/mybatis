package com.yzm.object_factory.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yzm.object_factory.mapper")
public class MybatisConfig {
}
