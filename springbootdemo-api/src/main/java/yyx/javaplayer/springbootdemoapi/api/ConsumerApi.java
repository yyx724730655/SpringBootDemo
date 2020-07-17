package yyx.javaplayer.springbootdemoapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import yyx.javaplayer.springbootdemoapi.hystrixImpl.ConsumerHystrix;

//name 为product项目中application.yml配置文件中的application.name;
//path 为product项目中application.yml配置文件中的context.path;
@FeignClient(name = "consumer-server",path ="consumer",url = "http://localhost:7001",fallback = ConsumerHystrix.class)
//@FeignClient(name = "product-server",path = "product")
//@Componet注解最好加上，不加idea会显示有错误，但是不影响系统运行；
@Component
public interface ConsumerApi {

    @RequestMapping("/consumerController/test")
    public String testConsumerService();
}
