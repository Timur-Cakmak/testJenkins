package timur.cakmak.testjenkins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import timur.cakmak.product.ProductService;

@SpringBootApplication
public class TestJenkinsApplication {
	

	
	public static void main(String[] args) {
		SpringApplication.run(TestJenkinsApplication.class, args);
	}
	
	

}
