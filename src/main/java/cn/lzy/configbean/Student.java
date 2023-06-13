package cn.lzy.configbean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component //把实体类对象以bean方式注入到spring容器中
@ConfigurationProperties(prefix = "student")//把配置文件以student开头的属性值通过setter方法注入到实体类对应的属性
public class Student {
    private int id;//学号
    private String name;//名字
    private int age;//年龄
    private String[] hobby;//爱好
    private List electProduct;//电子产品
    private Map friends;//朋友
    private Course course;//课程

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public List getElectProduct() {
        return electProduct;
    }

    public void setElectProduct(List electProduct) {
        this.electProduct = electProduct;
    }

    public Map getFriends() {
        return friends;
    }

    public void setFriends(Map friends) {
        this.friends = friends;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student() {
    }

    public Student(int id, String name, int age, String[] hobby, List electProduct, Map friends, Course course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.electProduct = electProduct;
        this.friends = friends;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                ", electProduct=" + electProduct +
                ", friends=" + friends +
                ", course=" + course +
                '}';
    }
}
