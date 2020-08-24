package org.mbs.lecture.ioc;

/**
 * Created by mbs on 2020/8/20 14:55
 */
public class TaskCalculate implements Calculate {
	@Override
	public void doWork() {
		doLogic();
	}

	public void doLogic() {
		System.out.println("TaskCalculate.doLogic...");
	}
}
