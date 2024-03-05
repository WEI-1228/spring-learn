package cn.anlper.autowired.controller;

import cn.anlper.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    public void add() {
        System.out.println("controller执行了");
        service.add();
    }
}
