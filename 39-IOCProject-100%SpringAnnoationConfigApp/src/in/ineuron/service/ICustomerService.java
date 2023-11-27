package in.ineuron.service;

import in.ineuron.dto.CustomerDto;

public interface ICustomerService {

	public String calculateCustomerInterest(CustomerDto dto) throws Exception;
}
