package cn.anlper.service.impl;

import cn.anlper.annotation.Bean;
import cn.anlper.dao.UserDao;
import cn.anlper.service.UserService;

@Bean
public class UserServiceImpl implements UserService {
    private UserDao dao;

    public void run() {
        System.out.println("service运行了");
        dao.run();
    }
}
