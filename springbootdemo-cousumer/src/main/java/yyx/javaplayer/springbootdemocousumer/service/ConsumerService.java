package yyx.javaplayer.springbootdemocousumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

//name 为product项目中application.yml配置文件中的application.name;
//path 为product项目中application.yml配置文件中的context.path;
//@FeignClient(name = "consumer-server",path ="/consumer" )
//@Componet注解最好加上，不加idea会显示有错误，但是不影响系统运行；
//@Component
public interface ConsumerService {

    @RequestMapping("testConsumerService")
    public String testConsumerService();
}
