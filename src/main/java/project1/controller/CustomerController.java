package project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import project1.dao.CustomerDAO;
import project1.entity.Customer;
import project1.service.Interface.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/index")
	public String index(Model m)
	{
		List<Customer> customers = customerService.getCustomers();
		
		m.addAttribute("customers", customers);
		return "index";
		
	}
	
	@GetMapping("/create")
	public String create(Model m,Customer customer)
	{
		customer = new Customer();
		m.addAttribute("customer", customer);
		return "create";
		
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("customer") Customer customer)
	{
		customerService.saveCustomer(customer);
		return "redirect:/customer/index";
		
	}
	
	@GetMapping("/{id}/edit")
	public String edit(Model m,Customer customer,@PathVariable("id") int id)
	{
		customer=customerService.getCustomer(id);
		m.addAttribute("customer", customer);
		return "edit";
		
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute("customer") Customer customer)
	{
		customerService.updateCustomer(customer);
		return "redirect:/customer/index";
		
	}
	
	@GetMapping("/{id}/delete")
	public String delete(@PathVariable("id") int id)
	{
		Customer customer = customerService.getCustomer(id);
		
		customerService.deleteCustomer(customer);
		
		return "redirect:/customer/index";
		
	}
	


}
