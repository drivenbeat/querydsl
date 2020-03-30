package study.querydsl.repository.ialcon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import study.querydsl.entity.ialcon.Customer;
import study.querydsl.entity.ialcon.Product;

import javax.persistence.EntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@Transactional
class ProductRepositoryTest {

    @Autowired
    EntityManager em;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Test

    public void initTest() {

        Product p1 = new Product("test1", "a1");
        Product p2 = new Product("test2", "a2");
        Product p3 = new Product("test3", "a3");
        Product p4 = new Product("test4", "a4");



        Customer c1 = new Customer("customer1", "c1");
        Customer c2 = new Customer("customer1", "c2");
        Customer c3 = new Customer("customer1", "c3");
        Customer c4 = new Customer("customer1", "c4");

        productRepository.save(p1);
        customerRepository.save(c1);
        productRepository.save(p2);
        customerRepository.save(c2);
        productRepository.save(p3);
        customerRepository.save(c3);
        productRepository.save(p4);
        customerRepository.save(c4);


        List<Product> products = productRepository.findAll();
        for (Product product : products) {
            System.out.println("product = " + product.toString());
        }
        List<Customer> customers = customerRepository.findAll();
        for (Customer customer : customers) {
            System.out.println("customer = " + customer.toString());
        }




    }

}