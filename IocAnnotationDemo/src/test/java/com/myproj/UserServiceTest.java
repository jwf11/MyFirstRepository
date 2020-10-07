package com.myproj;

import com.myproj.domain.User;
import com.myproj.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    @Test
    public void testFindAll(){
        //1. 获取spring核心容器
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
        // 2. 通过容器获得bean对象;
        UserService userService = c.getBean("UserService", UserService.class);
        for (User u: userService.findAll()) {
            System.out.println(u.getId());
        }
    }

    @Test
    public void testSave(){
        //1. 获取spring核心容器
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
        // 2. 通过容器获得bean对象;
        UserService userService = c.getBean("UserService", UserService.class);

        User u = new User("zhangsan", 12, 2000);
        userService.save(u);

    }
}
