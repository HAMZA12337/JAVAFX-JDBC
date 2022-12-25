package ma.dao;


import ma.dao.entities.Product;

public interface DaoProduct extends Dao<Product> {
    public Product getProduitByQuery();
}
