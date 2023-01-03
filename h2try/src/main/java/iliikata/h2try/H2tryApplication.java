package iliikata.h2try;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2tryApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2tryApplication.class, args);
		System.out.println("http://localhost:8080/sign%20up");
	}

}
