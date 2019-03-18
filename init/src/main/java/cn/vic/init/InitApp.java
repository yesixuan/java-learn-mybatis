package cn.vic.init;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "cn.vic.init.mapper", nameGenerator = MapperNameGenerator.class)
public class InitApp {

    public static void main(String[] args) {
        SpringApplication.run(InitApp.class);
    }
}
