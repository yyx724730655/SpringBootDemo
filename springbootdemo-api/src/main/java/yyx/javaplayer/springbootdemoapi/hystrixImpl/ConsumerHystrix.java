package yyx.javaplayer.springbootdemoapi.hystrixImpl;

import org.springframework.stereotype.Component;
import yyx.javaplayer.springbootdemoapi.api.ConsumerApi;

/**
 * Hystrix熔断器处理类
 */
@Component
public class ConsumerHystrix implements ConsumerApi {
    @Override
    public String testConsumerService() {
        return "{\"id\":-1,\"name\":\"熔断用户\",\"msg\":\"请求异常，返回ConsumerHystrix熔断用户！\"}";
    }
}
