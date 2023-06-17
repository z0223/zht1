package cn.lzy;

import cn.lzy.configbean.Person;
import cn.lzy.configbean.Student;
import cn.lzy.configbean.User;
import cn.lzy.controller.ChapterController;

import cn.lzy.customconfig.CustomProperties;
import cn.lzy.customconfig.MyProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChapterTestApplication {
    @Autowired
    ChapterController chapterController;

    @Autowired
    Student student;
    @Value("${student.name}")
    String name;

    @Autowired
    User user;
    @Autowired
    Person person;

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    CustomProperties customProperties;

    @Test
    public void getHello(){
        String hello=chapterController.sayHello();
        //System.out.println("单元测试返回=="+hello);
        //System.out.println("单元测试返回=="+student);
        //System.out.println("单元测试Value返回=="+name);
        System.out.println("单元测试User数据=="+user);
        String result = student.toString();
        System.out.println("单元测试返回的person的数据--"+ person);
        MyProperties myProperties = (MyProperties) applicationContext.getBean("xmlProperties");
        if (myProperties != null){
            myProperties.getResult();
        }
        System.out.println("单元测试返回CustomProperties数据==="+customProperties);

        /*try {
            System.out.println("单元测试返回student的数据---" + new String(result.getBytes("iso8859-1"), "utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }*/
    }


}
