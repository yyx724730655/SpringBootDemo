package yyx.javaplayer.springbootdemocousumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"yyx.javaplayer.springbootdemoapi.api"})
//@EnableFeignClients
@EnableDiscoveryClient
public class SpringbootdemoCousumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoCousumerApplication.class, args);
    }

}
