package DiamondShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DiamondShop.Entity.Categories;
import DiamondShop.Entity.MapperCategories;
import DiamondShop.Entity.MapperSlides;
import DiamondShop.Entity.Slides;

@Repository
public class CategoriesDao extends BaseDao{

    public List<Categories> GetCategories(){
    	List<Categories> list = new ArrayList<Categories>();
    	String sql = "SELECT * FROM categories ";
    	list = _jdbcTemplate.query(sql, new MapperCategories());
    	return list;
    }
}
