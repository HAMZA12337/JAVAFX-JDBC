package ma.dao;

import ma.dao.entities.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoCategoryImp implements DaoCategory{
    @Override
    public List<Category> findALl() {
        List<Category> list = new ArrayList<>();
        Connection connection;
        try{
            connection = SingletonConnectionDB.getConnection();
            String query = "select * from CATEGORIES";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet res = preparedStatement.executeQuery();
            while (res.next()){
                Category c = new Category();
                c.setId(res.getInt("ID"));
                c.setName(res.getString("NAME"));
                list.add(c);
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public Category save(Category a) {
        return null;
    }

    @Override
    public boolean delete(Category a) {
        return false;
    }

    @Override
    public Category update(Category a) {
        return null;
    }
}
