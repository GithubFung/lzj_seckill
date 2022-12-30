package com.lzj_seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lzj_seckill.pojo")
public class LzjSeckillApplication {

    public static void main(String[] args) {
        SpringApplication.run(LzjSeckillApplication.class, args);
    }

}
