package in.ineuron.dao;

import in.ineuron.bo.CustomerBo;

public interface ICustomerDao {

	public int save(CustomerBo bo) throws Exception;
}
