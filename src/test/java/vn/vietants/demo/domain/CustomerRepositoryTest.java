package vn.vietants.demo.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CustomerRepositoryTest {
    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void test() {
        Customer customer = Customer.builder()
                .customerName("Pham Ngoc Hoai")
                .address("Kim Van Kim Lu")
                .age(34)
                .build();

        customerRepository.save(customer);
    }
}
