package com.nangua.database_shardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nangua.database_shardingsphere.mapper")
public class DatabaseShardingSphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseShardingSphereApplication.class, args);
    }

}
