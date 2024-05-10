package guru.springframework.assignment3;

import guru.springframework.assignment3.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Assignment3ApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowireOfController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromCtx() {
		MyController myController = applicationContext.getBean(MyController.class);

		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
