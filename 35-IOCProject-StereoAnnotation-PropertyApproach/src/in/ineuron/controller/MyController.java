package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.ineuron.dto.CustomerDto;
import in.ineuron.service.ICustomerService;
import in.ineuron.vo.CustomerVo;

@Component(value = "controller")
public class MyController {

	@Autowired
	private  ICustomerService service;

	static {
		System.out.println("MyController .class file is loading...");
	}

	public MyController() {

		System.out.println("MyController:: Zero param constructor");
	}

	public String processCustomer(CustomerVo vo) throws Exception {

		CustomerDto customerDTO = new CustomerDto();

		customerDTO.setCustomerName(vo.getCustomerName());
		customerDTO.setCustomerAddress(vo.getCustomerAddress());
		customerDTO.setPamt(Float.parseFloat(vo.getPamt()));
		customerDTO.setRate(Float.parseFloat(vo.getRate()));
		customerDTO.setTime(Float.parseFloat(vo.getTime()));

		String result = service.calculateCustomerInterest(customerDTO);

		if(result!=null)
		
		return result;
		return result;
	}

	@Override
	public String toString() {
		return "MyController [service=" + service + "]";
	}

}
