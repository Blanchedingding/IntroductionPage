package service;

import dao.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Customer;
import pojo.Order;

import java.util.List;

@Service("customerService")
public class CustomerImpl implements CustomerService {

    @Autowired
    CustomerMapper customerMapper;

    @Override
    public List<Customer> getCustomerById(int id) {
        return customerMapper.getCustomerById(id);
    }

    @Override
    public List<Order> getCustomerOrders(int id) {
        return customerMapper.getCustomerOrders(id);
    }
}
