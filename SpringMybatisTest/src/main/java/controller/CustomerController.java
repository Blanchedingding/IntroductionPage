package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Order;
import service.CustomerService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
//@RequestMapping("/user")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping("/orders")
    public ModelAndView listall(HttpServletRequest request, HttpServletResponse response){
        List<Order> orders=customerService.getCustomerOrders(1);
        System.out.println("orders");
        ModelAndView mav=new ModelAndView("user_orders");
        mav.addObject("orders",orders);
        return mav;
    }
}
