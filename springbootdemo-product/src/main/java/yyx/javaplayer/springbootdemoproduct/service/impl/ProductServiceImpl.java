package yyx.javaplayer.springbootdemoproduct.service.impl;

import org.springframework.stereotype.Service;
import yyx.javaplayer.springbootdemoproduct.service.ProductService;

public class ProductServiceImpl implements ProductService {

    @Override
    public String testProductService() {
        return "nice ProductService.testProductService()";
    }
}
