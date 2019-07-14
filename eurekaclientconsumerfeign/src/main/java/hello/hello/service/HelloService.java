package hello.hello.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Feign clien will access SERVICE-HELLO
 */
@FeignClient(value = "SERVICE-HELLO")
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello();
}
