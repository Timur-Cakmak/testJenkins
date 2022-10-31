package timur.cakmak.testjenkins;

//import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import timur.cakmak.product.Product;
import timur.cakmak.product.ProductRepository;

@SpringBootTest
class TestJenkinsApplicationTests {
	
	@Autowired
	ProductRepository productRepository;

	@Test
	public void testCreate() {
		Product product = new Product();
		product.setId(1L);
		product.setName("Headphone");
		product.setDescription("good");
		product.setPrice(200.00);
		productRepository.save(product);
//		assertThat(product).isEqualTo(productRepository.findById(1L).get());
//		assertNotNull(productRepository.findById(1L).get());
	}
}
