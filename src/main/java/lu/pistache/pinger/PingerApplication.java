package lu.pistache.pinger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PingerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingerApplication.class, args);
	}

}
