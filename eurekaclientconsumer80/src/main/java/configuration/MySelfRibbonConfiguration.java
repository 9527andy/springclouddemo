package configuration;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRibbonConfiguration {

    @Bean
    public IRule myRule(){
        //return new RandomRule();
        return new MySelfRandomRule();
    }
}
