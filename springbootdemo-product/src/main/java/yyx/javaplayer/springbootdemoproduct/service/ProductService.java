package yyx.javaplayer.springbootdemoproduct.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

//name 为product项目中application.yml配置文件中的application.name;
//path 为product项目中application.yml配置文件中的context.path;
//@FeignClient(name = "product-server",url = "http://localhost:7002/product",path ="/product" )
//@FeignClient(name = "produck-server",path = "product")
//@Componet注解最好加上，不加idea会显示有错误，但是不影响系统运行；
//@Component
//@Service
public interface ProductService {

    @RequestMapping(path = "testProductService")
    String testProductService();
}
