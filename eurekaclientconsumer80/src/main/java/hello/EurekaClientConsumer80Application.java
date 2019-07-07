package hello;

import configuration.MySelfRibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "SERVICE-HELLO",configuration = MySelfRibbonConfiguration.class )
public class EurekaClientConsumer80Application {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

//    @Primary
//    @Bean(value = "lbcRestTemplate")
//    RestTemplate lbcRestTemplate() {
//        return new RestTemplate();
//    }


    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumer80Application.class,args);
    }
}
