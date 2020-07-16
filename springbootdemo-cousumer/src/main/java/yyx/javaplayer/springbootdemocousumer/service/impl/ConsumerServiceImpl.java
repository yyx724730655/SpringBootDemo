package yyx.javaplayer.springbootdemocousumer.service.impl;

import org.springframework.stereotype.Service;
import yyx.javaplayer.springbootdemoapi.api.ConsumerApi;

@Service
public class ConsumerServiceImpl implements ConsumerApi {

    @Override
    public String testConsumerService() {
        return "nice ConsumerService.testConsumerService()";
    }
}
