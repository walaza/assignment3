/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dvdrental.services;

import dvdrental.domain.Customer;
import java.util.List;

/**
 *
 * @author bulelani
 */
public interface CustomerService {
    List<Customer> getCustomers();
    Customer getCustomerByName(String name);
}
