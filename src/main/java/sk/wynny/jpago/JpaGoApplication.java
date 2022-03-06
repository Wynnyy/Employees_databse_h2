package sk.wynny.jpago;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaGoApplication {

	public static void main(String[] args) {
		//ApplicationContext kontext = SpringApplication.run(JpaGoApplication.class, args);
		SpringApplication.run(JpaGoApplication.class, args);

//		AppRun appRun = kontext.getBean(AppRun.class);
//		appRun.run();
	}

}
