package br.com.felipeamorim.ShortMyUrl;

import br.com.felipeamorim.ShortMyUrl.Domain.Entities.Url;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class ShortMyUrlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShortMyUrlApplication.class, args);
	}

}
