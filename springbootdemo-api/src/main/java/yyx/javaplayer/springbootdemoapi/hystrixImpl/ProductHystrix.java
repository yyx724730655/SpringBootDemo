package yyx.javaplayer.springbootdemoapi.hystrixImpl;

import org.springframework.stereotype.Component;
import yyx.javaplayer.springbootdemoapi.api.ProductApi;

/**
 * Hystrix熔断器处理类
 */
@Component
public class ProductHystrix implements ProductApi {
    @Override
    public String testProductService() {
        return "{\"id\":-1,\"name\":\"熔断用户\",\"msg\":\"请求异常，返回ProductHystrix熔断用户！\"}";
    }
}
