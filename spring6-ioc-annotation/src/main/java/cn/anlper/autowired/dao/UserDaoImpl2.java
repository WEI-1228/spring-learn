package cn.anlper.autowired.dao;

import org.springframework.stereotype.Repository;

@Repository("xx")
public class UserDaoImpl2 implements UserDao{
    @Override
    public void add() {
        System.out.println("新的Dao来了");
    }
}
