package jianbin.mybatistest.service;

import jianbin.mybatistest.dao.UserDao;
import jianbin.mybatistest.generator.User;
import jianbin.mybatistest.generator.UserExample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserDao userDao;

    public List<User> getAll() {
        UserExample example = new UserExample();
        example.setLimit(10);
        return userDao.selectByExample(example);
    }
}
