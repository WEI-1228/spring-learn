package cn.anlper.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

//        User user = (User) context.getBean("user");
//        System.out.println(user);

//        User user1 = context.getBean(User.class);
//        System.out.println(user1);

        User user2 = context.getBean("user", User.class);
        System.out.println(user2);
    }
}
