package leidens.cris.testelombok;

import leidens.cris.testelombok.dao.ClassDAO;
import leidens.cris.testelombok.dao.ClassJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestelombokApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = (ApplicationContext) SpringApplication.run(TestelombokApplication.class, args);

		ClassJDBC objJDBC = applicationContext.getBean(ClassJDBC.class);
		ClassDAO objDAO = applicationContext.getBean(ClassDAO.class);
	}

}
