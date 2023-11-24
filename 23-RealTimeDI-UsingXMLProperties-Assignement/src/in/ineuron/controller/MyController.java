package in.ineuron.controller;

import java.util.List;

import in.ineuron.bo.EmployeeBo;
import in.ineuron.dto.EmployeeDto;
import in.ineuron.service.IEmployeeService;
import in.ineuron.vo.EmployeeVo;

public class MyController {

	private static IEmployeeService service;

	static {
		System.out.println("MyController .class file is loading...");
	}

	public MyController(IEmployeeService service) {

		this.service = service;
		System.out.println("IEmployeeServiceImpl class is instantiated....");
		System.out.println("Implementation class is::" + service.getClass().getName());

	}

	public static String AddEmployee(EmployeeVo vo) {
		EmployeeDto dto = new EmployeeDto();
		dto.setEid(Integer.parseInt(vo.getEid()));
		dto.setEname(vo.getEname());
		dto.setEage(Integer.parseInt(vo.getEage()));
		dto.setEaddress(vo.getEaddress());

		String status = service.saveEmployee(dto);

		if (status != null)

			return status;
		return status;

	}

	public static String deleteEmployee(int id) {

		String status = service.deleteEmployee(id);

		return status;

	}

	public static EmployeeBo getEmployee(int id) {

		EmployeeBo emp = service.getEmployee(id);

		if (emp != null) {

			return emp;

		}

		return emp;
	}

	public static List<EmployeeBo> getAllEmployee() {

		List<EmployeeBo> empAll = service.getAllEmployee();

		return empAll;

	}

	@Override
	public String toString() {
		return "MyController [service=" + service + "]";
	}

}
