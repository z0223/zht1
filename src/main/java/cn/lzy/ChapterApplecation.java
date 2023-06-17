package cn.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication //SpringBootApplication注释springboot的入口类(启动类)
@ImportResource("classpath:xmlproperties.xml")//加载自定义xml配置文件位置
public class ChapterApplecation {
    public static void main(String[] args) {
        SpringApplication.run(ChapterApplecation.class,args);
    }
}
