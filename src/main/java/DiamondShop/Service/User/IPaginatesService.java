package DiamondShop.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dto.PaginatesDto;

@Service
public interface IPaginatesService {
	
	public PaginatesDto GetInfoPaginates();
}
