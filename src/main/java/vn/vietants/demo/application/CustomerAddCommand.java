package vn.vietants.demo.application;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CustomerAddCommand {
    private String customerName;

    private String address;

    private int age;
}
