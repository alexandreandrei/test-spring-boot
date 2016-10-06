package fr.ippon.aandrei.test.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

    @ResponseBody
    @RequestMapping("/user")
    public String getUser() {
        return "hello";
    }

}