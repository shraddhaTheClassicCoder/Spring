package in.ineuron.service;

import java.util.List;

import in.ineuron.bo.EmployeeBo;
import in.ineuron.dao.IEmployeeDao;
import in.ineuron.dto.EmployeeDto;

public class IEmployeeServiceImpl implements IEmployeeService {

	private IEmployeeDao dao;

	static {
		System.out.println("IEmployeeServiceImpl .class file is loading...");
	}

	public IEmployeeServiceImpl(IEmployeeDao dao) {

		this.dao = dao;
		System.out.println("IEmployeeServiceImpl class is instantiated....");
		System.out.println("Implementation class is::" + dao.getClass().getName());
	}

	@Override
	public String saveEmployee(EmployeeDto dto) {

		int count = 0;
		EmployeeBo bo = new EmployeeBo();

		bo.setEid(dto.getEid());
		bo.setEname(dto.getEname());
		bo.setEage(dto.getEage());
		bo.setEaddress(dto.getEaddress());

		count = dao.saveEmployee(bo);

		return count == 0 ? "Registration failed" : "Registration Sucessful";
	}

	@Override
	public String deleteEmployee(int id) {

		int count = dao.deleteEmployee(id);

		return count == 0 ? "Employee record deletion  failed" : "Employee record deleted Suceefully";
	}

	@Override
	public EmployeeBo getEmployee(int id) {

		EmployeeBo employee = dao.getEmployee(id);

		return employee;
	}

	@Override
	public String updateEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		return "IEmployeeServiceImpl [dao=" + dao + "]";
	}

	@Override
	public List<EmployeeBo> getAllEmployee() {
		
		List<EmployeeBo> bo=dao.getAllEmployee();
		return bo;
	}

}
