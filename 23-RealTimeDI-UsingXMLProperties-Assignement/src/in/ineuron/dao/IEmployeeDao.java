package in.ineuron.dao;

import java.util.List;

import in.ineuron.bo.EmployeeBo;
import in.ineuron.dto.EmployeeDto;

public interface IEmployeeDao {

	public int saveEmployee(EmployeeBo bo);
	public String updateEmployee(int id);
	public int deleteEmployee(int id);
	public EmployeeBo getEmployee(int id);
	public List<EmployeeBo> getAllEmployee();
}
