package vn.vietants.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.vietants.demo.application.CustomerAddCommand;
import vn.vietants.demo.application.CustomerService;
import vn.vietants.demo.domain.Customer;

import java.util.List;

@RestController()
@RequestMapping("/api/customer")
public class CustomerResource {
    @Autowired
    CustomerService customerService;

    @GetMapping("")
    public List<Customer> findAll () {
        return customerService.findAll();
    }

    @PostMapping("")
    public Customer addCustomer (@RequestBody CustomerAddCommand customerAddCommand) {
        return customerService.addCustomer(customerAddCommand);
    }
}
