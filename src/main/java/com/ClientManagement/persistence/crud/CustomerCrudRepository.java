package com.ClientManagement.persistence.crud;


import com.ClientManagement.persistence.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerCrudRepository extends CrudRepository<Customer,Integer> {

    Optional<List<Customer>> findAllByIdCustomer(int idCustomer);
}
