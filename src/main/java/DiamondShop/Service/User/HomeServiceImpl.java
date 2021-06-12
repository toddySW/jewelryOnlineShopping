package DiamondShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.CategoriesDao;
import DiamondShop.Dao.MenuDao;
import DiamondShop.Dao.ProductsDao;
import DiamondShop.Dao.SlidesDao;
import DiamondShop.Dto.ProductsDto;
import DiamondShop.Entity.Categories;
import DiamondShop.Entity.Menu;
import DiamondShop.Entity.Slides;

@Service  
public class HomeServiceImpl implements IHomeService {
    @Autowired
	private SlidesDao slidesDao;
    @Autowired
    private CategoriesDao categoriesDao;
    @Autowired
    private MenuDao menuDao;
    @Autowired
    private ProductsDao productsDao;
   
	//Kế thừa Interface --> Phải thực thị những cái method bắt buộc của Interface
    
	public List<Slides> GetDataSlides() {
		return slidesDao.GetDataSlides();
	}
	//
	public List<Categories> GetCategories() {
		return categoriesDao.GetCategories();
	}
	//
	public List<Menu> GetDataMenu() {
		return menuDao.GetDataMenu();
	}
	//
	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		return listProducts;
	}
	
}
