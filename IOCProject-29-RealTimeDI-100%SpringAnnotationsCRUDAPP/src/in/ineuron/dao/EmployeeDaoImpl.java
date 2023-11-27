package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.ineuron.bo.EmployeeBO;
import in.ineuron.dto.EmployeeDTO;

@Repository(value = "dao")
public class EmployeeDaoImpl implements IEmployeeDAO {

	private static final String SQL_INSERT_QUERY = "insert into employee(name,age,address,salary,hike) values(?,?,?,?,?)";

	static {
		System.out.println("EmployeeDaoImpl.class file is loading...");
	}

	public EmployeeDaoImpl() {
		System.out.println("EmployeeDaoImpl :: Zero param constructor...");
	}

	@Autowired
	private DataSource datasource;

	@Override
	public int save(EmployeeBO bo) {

		int count = 0;
		try (Connection connection = datasource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(SQL_INSERT_QUERY)) {

			pstmt.setString(1, bo.getEname());

			Integer eage = bo.getEage();

			if (eage != null) {
				pstmt.setInt(2, bo.getEage());
			} else {
				pstmt.setInt(2, 0);
			}

			pstmt.setString(3, bo.getEaddress());
			pstmt.setFloat(4, bo.getEsalary());
			pstmt.setFloat(5, bo.getHikeAmount());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public String toString() {
		return "EmployeeDaoImpl [datasource=" + datasource + "]";
	}

}
