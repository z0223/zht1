package cn.lzy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//Controller类 所在的包必须是@SpringBootApplication注解标识的入口类所在的包或者包
public class ChapterController {

    @RequestMapping(value = "/hello")//标识返回的数据是json
    public String sayHello(){
        return "你好 spring boot!";
    }
}
