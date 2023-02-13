package id.ardev.resto.controller;

import id.ardev.resto.dao.CategoryDAO;
import id.ardev.resto.dao.CategoryDAOMySQL;
import id.ardev.resto.model.Category;
import java.util.List;

public class CategoryController {
    private CategoryDAO dao = new CategoryDAOMySQL();
    
    public List<Category> getAllData() {
        return dao.getAllCategory();
    }
}
