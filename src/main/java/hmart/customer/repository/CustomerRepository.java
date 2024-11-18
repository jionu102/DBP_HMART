package hmart.customer.repository;

import hmart.customer.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    Customer save(Customer customer);  //insert
    Optional<Customer> findById(String id); //select
    Optional<Customer> findByName(String name); //select
    List<Customer> findAll(); //
}
