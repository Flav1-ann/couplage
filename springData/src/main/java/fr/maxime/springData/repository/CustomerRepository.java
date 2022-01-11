package fr.maxime.springData.repository;

import fr.maxime.springData.domain.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
