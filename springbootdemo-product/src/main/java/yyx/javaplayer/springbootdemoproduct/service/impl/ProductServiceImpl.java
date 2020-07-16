package yyx.javaplayer.springbootdemoproduct.service.impl;

import org.springframework.stereotype.Service;
import yyx.javaplayer.springbootdemoapi.api.ProductApi;

@Service
//@RequestMapping("/productService")
public class ProductServiceImpl implements ProductApi {

    @Override
    //@RequestMapping("testProductService")
    public String testProductService() {
        return "nice ProductService.testProductService()";
    }
}
