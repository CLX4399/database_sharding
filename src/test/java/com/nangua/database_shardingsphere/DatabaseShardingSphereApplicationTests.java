package com.nangua.database_shardingsphere;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

@SpringBootTest
class DatabaseShardingSphereApplicationTests {

    @Test
    void contextLoads() {
        // 使用 FastAutoGenerator 快速配置代码生成器
        FastAutoGenerator.create("jdbc:mysql://39.100.89.106:6033/db_clx?serverTimezone=GMT%2B8", "root", "root_clx4399")
                .globalConfig(builder -> {
                    builder.author("nangua") // 设置作者
                            .outputDir("src\\main\\java") // 输出目录
                            .dateType(DateType.TIME_PACK) // 设置时间类型策略
                            .commentDate("yyyy-MM-dd"); // 设置注释日期格式
                })
                .packageConfig(builder -> {
                    builder.parent("com.nangua.database_shardingsphere") // 设置父包名
                            .entity("model") // 设置实体类包名
                            .mapper("dao") // 设置 Mapper 接口包名
                            .service("service") // 设置 Service 接口包名
                            .serviceImpl("service.impl") // 设置 Service 实现类包名
                            .xml("mappers"); // 设置 Mapper XML 文件包名
                })
                .strategyConfig(builder -> {
                    builder // 设置需要生成的表名
                            .addTablePrefix("example_")
                            .entityBuilder()
                            .enableLombok() // 启用 Lombok
                            .enableTableFieldAnnotation() // 启用字段注解
                            .controllerBuilder()
                            .enableRestStyle(); // 启用 REST 风格
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用 Freemarker 模板引擎
                .execute(); // 执行生成
    }

}
