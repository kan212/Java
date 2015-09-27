package com.design.pattern.factory;

import java.util.List;
import java.util.Random;


public class Factory {

	public static Human createHuman(Class c) {
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return human;
	}
	
	public static Human createHuman() {
		Human human = null;
		List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
		Random random = new Random();
		int s = random.nextInt(concreteHumanList.size());
		human = createHuman(concreteHumanList.get(s));
		return human;
	}
	
}
