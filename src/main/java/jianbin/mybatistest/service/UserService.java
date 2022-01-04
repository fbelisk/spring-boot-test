package jianbin.mybatistest.service;

import jianbin.mybatistest.dao.UserDao;
import jianbin.mybatistest.generator.User;
import jianbin.mybatistest.generator.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public User getAll() {
        UserExample example = new UserExample();
        example.setLimit(10);
        return userDao.selectByPrimaryKey(1);
    }
}
