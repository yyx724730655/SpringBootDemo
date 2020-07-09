package yyx.javaplayer.springbootdemocousumer.service.impl;

import org.springframework.stereotype.Service;
import yyx.javaplayer.springbootdemocousumer.service.ConsumerService;

@Service("consumerService")
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public String testConsumerService() {
        return "nice ConsumerService.testConsumerService()";
    }
}
