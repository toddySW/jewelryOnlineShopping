package DiamondShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dto.ProductsDto;
import DiamondShop.Entity.Categories;
import DiamondShop.Entity.Menu;
import DiamondShop.Entity.Slides;
@Service // annotation định nghĩa là một service
public interface IHomeService {
	  @Autowired //annotation tự động quét
	 //lấy dữ liệu từ bảng slides
	 public List<Slides> GetDataSlides();
	 //lấy dữ liệu từ bảng categories
	 public List<Categories> GetCategories();
	 //
	 public List<Menu> GetDataMenu();
	 //
	 public List<ProductsDto> GetDataProducts();
}
