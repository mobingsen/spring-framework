package org.mbs.lecture.tx.service.impl;

import org.mbs.lecture.ioc.Student;
import org.mbs.lecture.tx.dao.StudentDao;
import org.mbs.lecture.tx.service.StudentService;

/**
 * Created by mbs on 2020/6/18 10:13
 */
public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public void save(Student student) {
		this.studentDao.save(student);
//		throw new RuntimeException("RuntimeException Occur");
	}
}
