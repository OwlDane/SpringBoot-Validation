package belajar_springboot_validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import belajar_springboot_validation.properties.DatabaseProperties;

@EnableConfigurationProperties({
	DatabaseProperties.class
})
@SpringBootApplication
public class SpringValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringValidationApplication.class, args);
	}

}
