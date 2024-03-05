package cn.anlper.dao.impl;

import cn.anlper.annotation.Bean;
import cn.anlper.dao.UserDao;

@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void run() {
        System.out.println("Dao运行了");
    }
}
