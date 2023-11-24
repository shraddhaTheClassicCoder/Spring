package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import in.ineuron.bo.CustomerBo;

public class ICustomerDaoImpl implements ICustomerDao {

	private DataSource dataSource;
	// private static Connection connection;
	private static final String REALTIMEDI_CUSTOMER_INSERT_QUERY = "insert into customer(`cname`,`caddress`,`camt`,`crate`,`ctime`,`instrAmt`)values(?,?,?,?,?,?)";

	static {
		System.out.println("ICustomerDaoImpl .class file is loading....");
	}

	public ICustomerDaoImpl(DataSource dataSource) {

		this.dataSource = dataSource;
		System.out.println("ICustomerDaoImpl:: one param constructor");
		System.out.println("The Implemented class name is: " + dataSource.getClass().getName());
	}

	@Override
	public int save(CustomerBo bo) throws Exception {

		int count = 0;
		try (Connection connection = dataSource.getConnection();
				PreparedStatement pstmt = connection.prepareStatement(REALTIMEDI_CUSTOMER_INSERT_QUERY)) {

			
			
			
			pstmt.setString(1, bo.getCustomerName());
			pstmt.setString(2, bo.getCustomerAddress());
			pstmt.setFloat(3, bo.getPamt());
			pstmt.setFloat(4, bo.getRate());
			//pstmt.setFloat(5, bo.getTime());
			
			Float time = bo.getTime();
			if (time != null) {
			    pstmt.setFloat(5, time);
			} else {
			    // Handle the situation where time is null, maybe set a default value or handle it accordingly
			    // Example:
			    pstmt.setFloat(5, 0.0f); // Setting a default value of 0.0 if time is null
			}
			
			pstmt.setFloat(6, bo.getInstrAmt());

			count = pstmt.executeUpdate();

		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return count;
	}

	@Override
	public String toString() {
		return "ICustomerDaoImpl [dataSource=" + dataSource + "]";
	}
	
	

}
