package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.bo.CustomerBo;
import in.ineuron.dao.ICustomerDao;
import in.ineuron.dto.CustomerDto;

@Service(value = "service")
public class ICustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao dao;
	
	static {
		System.out.println("ICustomerServiceImpl .class file is loading...");
	}
	
	public ICustomerServiceImpl() {
		System.out.println(" ICustomerServiceImpl :: Zero Param constrctor");
	}
	
	
	@Override
	public String calculateCustomerInterest(CustomerDto dto) throws Exception {
		
		float instrAmt=dto.getPamt()*dto.getRate()*dto.getTime();
		
		CustomerBo bo=new CustomerBo();
		bo.setCustomerName(dto.getCustomerName());
		bo.setCustomerAddress(dto.getCustomerAddress());
		bo.setInstrAmt(instrAmt);
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getTime());
		bo.setRate(dto.getRate());
		
		int count=dao.save(bo);
		
		
		return count == 0 ? "customer registration failed"
				: "customer registration succesfull---->SimpleInterestAmount::" + instrAmt;
	}

	@Override
	public String toString() {
		return "ICustomerServiceImpl [dao=" + dao + "]";
	}

	
	

}
