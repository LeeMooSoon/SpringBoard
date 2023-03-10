package main.springboard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "main.springboard")

public class SpringBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoardApplication.class, args);
    }

}
