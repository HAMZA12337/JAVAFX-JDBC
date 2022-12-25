package ma.service;

import ma.dao.DaoCategory;
import ma.dao.entities.Category;

import java.util.List;

public class CategoryServiceImp implements CategoryService{
    DaoCategory daoCategory;

    public CategoryServiceImp(DaoCategory daoCategory) {
        this.daoCategory = daoCategory;
    }

    @Override
    public List<Category> getALl() {
        return daoCategory.findALl();
    }

    @Override
    public Category findById(int id) {
        return daoCategory.findById(id);
    }

    @Override
    public Category add(Category a) {
        return daoCategory.save(a);
    }

    @Override
    public boolean delete(Category a) {
        return daoCategory.delete(a);
    }

    @Override
    public Category update(Category a) {
        return daoCategory.update(a);
    }
}
