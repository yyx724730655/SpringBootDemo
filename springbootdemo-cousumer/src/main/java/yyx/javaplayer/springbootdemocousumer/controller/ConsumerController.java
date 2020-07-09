package yyx.javaplayer.springbootdemocousumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import yyx.javaplayer.springbootdemocousumer.service.ConsumerService;

@RestController
@RequestMapping("/consumerController")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    //@Autowired
    //private ProductService productService;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("test")
    public String test(){
        //String result=productService.testProductService();
        String result=restTemplate.getForObject("http://product-server/product/productController/test", String.class);
        System.out.println("测试consumerservice的方法"+result);
        return "nice consumerController.test()";
    }
}
