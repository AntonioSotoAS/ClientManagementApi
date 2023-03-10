package com.ClientManagement.domain.service;

import com.ClientManagement.domain.Customer;
import com.ClientManagement.domain.dto.CustomerDTO;
import com.ClientManagement.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<CustomerDTO> getAll(){
        return customerRepository.getAll();
    }
    public Optional<CustomerDTO> getCustomer(int customerId){
        return customerRepository.getCustomer(customerId);
    }
    public CustomerDTO save (CustomerDTO customer){
        return customerRepository.save(customer);
    }
    public CustomerDTO update(CustomerDTO customer){
        return customerRepository.update(customer);
    }
    public boolean delete(int customerId){
        if (getCustomer(customerId).isPresent()){
            customerRepository.delete(customerId);
            return true;
        }else {
            return false;
        }
    }
}
