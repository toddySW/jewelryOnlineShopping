package DiamondShop.Controller.Users;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import DiamondShop.Service.User.HomeServiceImpl;

@Controller
public class BaseController {
	@Autowired
    public HomeServiceImpl _homeService ;
    public ModelAndView _mvShare = new ModelAndView();
	
    @PostConstruct //annotation giúp cho Init() được chạy đầu tiên khi mở lên (thêm vào ở 'pom') 
	public ModelAndView Init() {
		_mvShare.addObject("menu", _homeService.GetDataMenu());
	    return _mvShare;
	}
}