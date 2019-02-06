package dao;

import pojo.Customer;
import pojo.Order;

import java.util.List;

public interface CustomerMapper {

    List<Customer> getCustomerById(int id);

    List<Order> getCustomerOrders(int id);

}
