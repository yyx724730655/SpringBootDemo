package yyx.javaplayer.springbootdemoproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;
import yyx.javaplayer.springbootdemoproduct.productconfig.RibbonConfiguration;

@SpringBootApplication
//@EnableEurekaClient 和 @EnableDiscoveryClient 都是让eureka发现该服务并注册到eureka上的注解
//相同点：都能让注册中心Eureka发现，并将该服务注册到注册中心上；
//不同点：@EnableEurekaClient只适用于Eureka作为注册中心，而@EnableDiscoveryClient可以是其他注册中心；
@EnableEurekaClient
//表示开启Fegin客户端
//@EnableFeignClients
// 修改启动类，使@CompantScan不扫描被自定义注解注解的类
@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION
,value = {yyx.javaplayer.springbootdemoproduct.productconfig.ExcludeComponent.class}))
//使用@RibbonClient的configuration属性，指定Ribbon的配置类
@RibbonClient(name = "product-server",configuration = RibbonConfiguration.class)
//在启动类上添加@EnableHystrix注解开启Hystrix的熔断器功能。
@EnableHystrix
public class SpringbootdemoProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoProductApplication.class, args);
    }

    @Bean
    @LoadBalanced //开启负载均衡ribbon
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
