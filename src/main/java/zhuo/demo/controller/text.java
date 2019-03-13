package zhuo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class text {
    @RequestMapping("ddd")
    public String text(){
        return "nihao ";
    }

}
