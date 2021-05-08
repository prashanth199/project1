package project1.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project1.dao.CustomerDAO;
import project1.entity.Customer;
import project1.service.Interface.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}
	
	@Transactional
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		 customerDAO.saveCustomer(customer);
		
	}
	
	@Transactional
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(id);
	}
	
	@Transactional
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.updateCustomer(customer);
		
	}

	@Transactional
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.deleteCustomer(customer);
		
	}

}
