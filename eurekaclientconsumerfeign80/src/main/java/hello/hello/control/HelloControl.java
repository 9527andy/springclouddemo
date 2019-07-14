package hello.hello.control;

import hello.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return helloService.hello();
    }

    @RequestMapping(value = "/hello/get/{id}", method = RequestMethod.GET)
    public void helloById(@PathVariable("id") Long id) {
         helloService.helloById(id);
    }
}
