package finki.ukim.mk.carrent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class CarrentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarrentApplication.class, args);
    }

}
