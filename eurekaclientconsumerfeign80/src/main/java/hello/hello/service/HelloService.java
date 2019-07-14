package hello.hello.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Feign client will access SERVICE-HELLO
 */
@FeignClient(value = "SERVICE-HELLO")
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello();

    @RequestMapping(value = "/hello/get/{id}", method = RequestMethod.GET)
    public void helloById(@PathVariable("id") Long id);
}
