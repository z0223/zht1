package cn.lzy;

import cn.lzy.configbean.Student;
import cn.lzy.controller.ChapterController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChapterTestApplication {
    @Autowired
    ChapterController chapterController;

    @Autowired
    Student student;

    @Test
    public void getHello(){
        String hello=chapterController.sayHello();
        System.out.println("单元测试返回=="+hello);
        System.out.println("单元测试返回=="+student);

    }


}
