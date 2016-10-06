package fr.ippon.aandrei.test.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

    @Value("${hello.msg:Hello}") private String helloMsg;

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return helloMsg;
    }

}