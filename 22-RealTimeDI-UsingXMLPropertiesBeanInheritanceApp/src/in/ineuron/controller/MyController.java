package in.ineuron.controller;

import org.springframework.stereotype.Service;

import in.ineuron.dto.CustomerDto;
import in.ineuron.service.ICustomerService;
import in.ineuron.vo.CustomerVo;

public class MyController {

	private static ICustomerService service;

	static {
		System.out.println("MyController .class file is loading...");
	}

	
	
	public MyController(ICustomerService service) {
		
		this.service = service;
		System.out.println("MyController:: One param constructor");
	}



	public String processCustomer(CustomerVo vo) throws Exception {
		
		
		CustomerDto customerDTO=new CustomerDto();
		
		customerDTO.setCustomerName(vo.getCustomerName());
		customerDTO.setCustomerAddress(vo.getCustomerAddress());
		customerDTO.setPamt(Float.parseFloat(vo.getPamt()));
		customerDTO.setRate(Float.parseFloat(vo.getRate()));
		customerDTO.setTime(Float.parseFloat(vo.getTime()));
		
		
		String result = service.calculateCustomerInterest(customerDTO);
		
		return result;
	}



	@Override
	public String toString() {
		return "MyController [service=" + service + "]";
	}
	
	
}
