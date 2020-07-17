package yyx.javaplayer.springbootdemoproduct.productconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ExcludeComponent
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule(){
        // 负载均衡规则改为随机
        return new RandomRule();
    }
}
