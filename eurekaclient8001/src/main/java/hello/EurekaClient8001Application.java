package hello;

import hello.control.HelloEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClient8001Application {
    private static Logger log = LoggerFactory.getLogger(HelloEndpoint.class);

//    @RequestMapping(value = "/greeting")
//    public String greet() {
//        log.info("Access /greeting");
//
//        List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
//        Random rand = new Random();
//
//        int randomNum = rand.nextInt(greetings.size());
//        return greetings.get(randomNum);
//    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient8001Application.class,args);
    }
}
