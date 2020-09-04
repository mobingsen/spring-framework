package org.mbs.web.lecture.service;

import org.mbs.web.lecture.dao.UserDao;
import org.mbs.web.lecture.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }
}
