package org.mbs.web.lecture.dao;

import org.mbs.web.lecture.model.User;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao {


	@Override
	public List<User> getUserList() {
		return Arrays.asList(
				new User(1L, "张三", 18),
				new User(2L, "李四", 20),
				new User(3L, "王五", 30)
		);
	}
}
