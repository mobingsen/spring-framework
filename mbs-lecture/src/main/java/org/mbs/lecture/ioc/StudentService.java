package org.mbs.lecture.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiaomo on 2020/9/28 10:27
 */
@Service
public class StudentService {

	@Autowired
	private PersonService personService;

	public void svi() {
		System.out.println("StudentService...");
	}
}
