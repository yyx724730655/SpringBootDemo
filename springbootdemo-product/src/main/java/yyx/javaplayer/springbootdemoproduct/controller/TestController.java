package yyx.javaplayer.springbootdemoproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yyx.javaplayer.springbootdemoapi.api.ConsumerApi;
import yyx.javaplayer.springbootdemoapi.api.ProductApi;

@RestController
@RequestMapping("/productController")
public class TestController {

    @Autowired
    private ProductApi productService;

    @Autowired
    private ConsumerApi consumerApi;

    @RequestMapping("test")
    public String ProductController(){
       String result=productService.testProductService();
        //String result=restTemplate.getForObject("http://product-server/testProductService", String.class);
       System.out.println(result);
        return "nice testProductController()";
    }

    @RequestMapping("connectConsumerController")
    public String ConnectConsumerController(){
        String result=consumerApi.testConsumerService();
        return "nice ConnectConsumerController()-->"+result;
    }
}
