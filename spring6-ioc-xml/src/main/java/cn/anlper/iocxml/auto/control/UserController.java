package cn.anlper.iocxml.auto.control;

import cn.anlper.iocxml.auto.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    private UserService service;

    public void setService(UserService service) {
        this.service = service;
    }

    void run() {
        service.run();
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController controller = context.getBean("controller", UserController.class);
        controller.run();
    }
}
