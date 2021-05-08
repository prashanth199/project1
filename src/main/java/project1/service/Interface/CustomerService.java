package project1.service.Interface;

import java.util.List;

import project1.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);
	
	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(Customer customer);
	
	

}
