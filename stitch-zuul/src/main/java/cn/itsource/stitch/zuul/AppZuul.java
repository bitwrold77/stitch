package cn.itsource.stitch.zuul;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //标识开启网关
@EnableEurekaClient //标识为Eureka客户端
public class AppZuul {

    public static void main(String[] args){
        SpringApplication.run(AppZuul.class,args);
    }

}
