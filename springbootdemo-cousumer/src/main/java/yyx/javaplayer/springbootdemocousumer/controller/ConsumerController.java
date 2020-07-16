package yyx.javaplayer.springbootdemocousumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yyx.javaplayer.springbootdemoapi.api.ConsumerApi;
import yyx.javaplayer.springbootdemoapi.api.ProductApi;

@RestController
@RequestMapping("/consumerController")
public class ConsumerController {

    @Autowired
    private ConsumerApi consumerService;

    @Autowired
    private ProductApi productService;


    @RequestMapping("test")
    public String test(){
        String result=productService.testProductService();
        //String result=consumerService.testConsumerService();
        System.out.println("测试consumerservice的方法"+result);
        return "nice consumerController.test()";
    }
}
