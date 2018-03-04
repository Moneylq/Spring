package top.idalin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMVCController {

    @RequestMapping("/testSpringMVC")
    public String testSpringMVC() {

        System.out.println("访问SpringMVC");
        return "success";

    }

}
