package cn.zb.tinyf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TinyfApplication {

    public static void main(String[] args) {
        SpringApplication.run(TinyfApplication.class, args);
    }

}
