package yyx.javaplayer.springbootdemoapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import yyx.javaplayer.springbootdemoapi.hystrixImpl.ProductHystrix;

//name 为product项目中application.yml配置文件中的application.name;
//path 为product项目中application.yml配置文件中的context.path;
@FeignClient(name = "product-server",path = "product",url = "http://localhost:7002",fallback = ProductHystrix.class)
//@FeignClient(name = "product-server",path = "product",url = "http://localhost:7002/")
//@Componet注解最好加上，不加idea会显示有错误，但是不影响系统运行；
@Component
public interface ProductApi {
    @RequestMapping(path = "/productController/test")
    String testProductService();
}
