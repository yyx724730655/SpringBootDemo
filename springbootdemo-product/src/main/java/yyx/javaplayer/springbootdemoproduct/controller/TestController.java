package yyx.javaplayer.springbootdemoproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import yyx.javaplayer.springbootdemoproduct.service.ProductService;

@RestController
@RequestMapping("/productController")
public class TestController {

    @Autowired
    private ProductService productService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("test")
    public String ProductController(){
       String result=productService.testProductService();
        //String result=restTemplate.getForObject("http://product-server/testProductService", String.class);
       System.out.println(result);
        return "nice testProductController()";
    }
}
