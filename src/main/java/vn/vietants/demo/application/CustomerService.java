package vn.vietants.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.vietants.demo.domain.Customer;
import vn.vietants.demo.domain.CustomerRepository;

import java.util.List;

@Service
@Transactional
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> findAll () {
        return customerRepository.findAll();
    }

    public Customer addCustomer (CustomerAddCommand customerAddCommand) {
        Customer customer = Customer.builder()
                .customerName(customerAddCommand.getCustomerName())
                .address(customerAddCommand.getAddress())
                .age(customerAddCommand.getAge())
                .build();

        return customerRepository.save(customer);
    }
}
