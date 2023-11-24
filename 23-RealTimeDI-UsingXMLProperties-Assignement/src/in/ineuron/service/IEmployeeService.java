package in.ineuron.service;

import java.util.List;

import in.ineuron.bo.EmployeeBo;
import in.ineuron.dto.EmployeeDto;

public interface IEmployeeService {

	public String saveEmployee(EmployeeDto bo);
	public String updateEmployee(int id);
	public String deleteEmployee(int id);
	public EmployeeBo getEmployee(int id);
	public List<EmployeeBo> getAllEmployee();
}
