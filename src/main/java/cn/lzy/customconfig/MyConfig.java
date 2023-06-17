package cn.lzy.customconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //注释标识当前类就是自定义配置类
public class MyConfig {

    @Bean("MyProperties")//将返回值对象作为组件添加到spring容器中,若没有标识id号则该组件id默认是方法名，而当前的id号是xmlProperties
    public MyProperties getMyProperties(){
        return new MyProperties();
    }
}
