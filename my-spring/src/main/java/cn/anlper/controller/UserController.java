package cn.anlper.controller;

import cn.anlper.annotation.Bean;
import cn.anlper.service.UserService;

@Bean
public class UserController {
    UserService service;
    public void run() {
        System.out.println("controller运行了");
        service.run();
    }
}
