package cn.anlper.autowired.service;

import cn.anlper.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    @Qualifier(value = "xx")
    private UserDao dao;

    @Override
    public void add() {
        System.out.println("service执行了");
        dao.add();
    }
}
