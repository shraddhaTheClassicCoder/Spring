package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.protocol.Resultset;

import in.ineuron.bo.EmployeeBo;
import in.ineuron.dto.EmployeeDto;

public class IEmployeeDaoImpl implements IEmployeeDao {

	private DataSource dataSource;

	private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY = "insert into employee(`id`,`name`,`age`,`address`)values(?,?,?,?)";

	private static final String REALTIMEDI_CUSTOMER_DELETE_QUERY = "delete from employee where id=?";

	private static final String REALTIMEDI_CUSTOMER_RETRIEVE_QUERY = "select id,name,age,address from employee where id=?"; 
	
	private static final String REALTIMEDI_CUSTOMER_RETRIEVEAll_QUERY = "select * from employee"; 
	
	static {
		System.out.println("IEmployeeDaoImpl .class file is loading...");
	}

	public IEmployeeDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
		System.out.println("IEmployeeDaoImpl class is instantiated....");
		System.out.println("Implementation class is::" + dataSource.getClass().getName());
	}

	@Override
	public int saveEmployee(EmployeeBo bo) {

		int count = 0;
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY)) {

			pstmt.setInt(1, bo.getEid());
			pstmt.setString(2, bo.getEname());
			pstmt.setInt(3, bo.getEage());
			pstmt.setString(4, bo.getEaddress());
			// pstmt.setFloat(5, bo.getTime());

			count = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}

		return count;

	}

	@Override
	public String updateEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteEmployee(int id) {
		int count = 0;
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(REALTIMEDI_CUSTOMER_DELETE_QUERY)) {

			pstmt.setInt(1, id);

			count = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}

		return count;

	}

	@Override
	public EmployeeBo getEmployee(int id) {
		
		int count = 0;
		EmployeeBo bo = new EmployeeBo();
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(REALTIMEDI_CUSTOMER_RETRIEVE_QUERY)) {

			pstmt.setInt(1, id);

			ResultSet res =pstmt.executeQuery();

			
			if(res!=null) {
				if(res.next()) {
					
					bo.setEid(res.getInt(1));
					bo.setEname(res.getString(2));
					bo.setEage(res.getInt(3));
					bo.setEaddress(res.getString(4));
					
				}
			}
			
		    
			return bo;
			
			}

		 catch (Exception e) {
			e.printStackTrace();

		}
		return bo;


	}

	@Override
	public List<EmployeeBo> getAllEmployee() {
	    List<EmployeeBo> employeeList = new ArrayList<>();
	    try (Connection connection = dataSource.getConnection();
	         PreparedStatement pstmt = connection.prepareStatement(REALTIMEDI_CUSTOMER_RETRIEVEAll_QUERY)) {

	        ResultSet res = pstmt.executeQuery();

	        while (res.next()) {
	            EmployeeBo bo = new EmployeeBo();
	            bo.setEid(res.getInt(1));
	            bo.setEname(res.getString(2));
	            bo.setEage(res.getInt(3));
	            bo.setEaddress(res.getString(4));
	            employeeList.add(bo);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	        // Handle the exception, maybe log it or throw a custom exception
	    }
	    return employeeList;
	}


	@Override
	public String toString() {
		return "IEmployeeDaoImpl [dataSource=" + dataSource + "]";
	}

}
