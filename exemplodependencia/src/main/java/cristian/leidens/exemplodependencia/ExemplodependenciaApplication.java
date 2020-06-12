package cristian.leidens.exemplodependencia;

import dao.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//SpringApplication.run(ExemplodependenciaApplication.class, args);

@SpringBootApplication

//Procura por um package dentro do "Java"
@ComponentScan("dao")
public class ExemplodependenciaApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext =SpringApplication.run(ExemplodependenciaApplication.class, args);

		ClassDAO objDAO = applicationContext.getBean(ClassDAO.class);

		System.out.println("objeto DAO: " + objDAO);

		System.out.println("Object JDBC on the object DAO: " + objDAO.getClassJDBC());

	}

}
