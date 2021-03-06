package service;

import pojo.Customer;
import pojo.Order;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomerById(int id);

    List<Order> getCustomerOrders(int id);
}
