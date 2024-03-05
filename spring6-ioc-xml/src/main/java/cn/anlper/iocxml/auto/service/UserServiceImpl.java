package cn.anlper.iocxml.auto.service;

import cn.anlper.iocxml.auto.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void run() {
        System.out.println("service运行了");
        dao.run();
    }
}
