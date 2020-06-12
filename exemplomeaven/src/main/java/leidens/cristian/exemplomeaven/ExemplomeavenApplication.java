package leidens.cristian.exemplomeaven;

import leidens.cristian.exemplomeaven.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExemplomeavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemplomeavenApplication.class, args);
		System.out.println("Hello world");

		Client client = new Client();
		client.setNameOfGame("GTA");
		client.setCategory("Action");
		System.out.println(client);
	}

}