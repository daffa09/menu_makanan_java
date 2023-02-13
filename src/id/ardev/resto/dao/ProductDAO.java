package id.ardev.resto.dao;

import id.ardev.resto.model.Product;
import java.util.List;


public interface ProductDAO {
    
    public boolean insert(Product p);
    
    public boolean update(Product p);
    
    public boolean delete(Product p);
    
    public List<Product> getAllProduct();
    
    public Product getByID(String id);
    
    public List<Product> getByName(String name);
    
}
