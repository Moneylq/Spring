package top.idalin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringMVC {

  /*  @RequestMapping("/")
    public String index() {
        System.out.println("index");
        return "index";
    }
*/
    @RequestMapping("/helloSpringMVC")
    public String helloSpringMVC() {
        System.out.println("Hello  SpringMVC！！");
        return "success";
    }

}
