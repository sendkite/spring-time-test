package com.example.springprac01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // 이거 없음 자동으로 시간 생성 안됨.
@SpringBootApplication
public class SpringPrac01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringPrac01Application.class, args);
    }

}
