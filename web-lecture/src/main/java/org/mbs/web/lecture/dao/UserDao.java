package org.mbs.web.lecture.dao;

import org.mbs.web.lecture.model.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserDao {

    List<User> getUserList();
}
