package project1.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project1.dao.CustomerDAO;
import project1.entity.Customer;

@Repository
public class CustomerRepository implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();

		Query<Customer> query = s.createQuery("from Customer", Customer.class);

		List<Customer> resultList = query.getResultList();

		return resultList;
	}

	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();

		s.saveOrUpdate(customer);
	}

	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Session s = sessionFactory.getCurrentSession();

		Customer customer = s.get(Customer.class, id);
		return customer;
	}

	public void updateCustomer(Customer customer) {


		Session s = sessionFactory.getCurrentSession();

		s.update(customer);

	}

	public void deleteCustomer(Customer customer) {

		Session s = sessionFactory.getCurrentSession();

		s.delete(customer);
		
		

	}

}
