package com.handong.dao;

import com.handong.constant.DatabaseFieldName;
import com.handong.model.Ingredient;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class IngredientDao {
    @Autowired
    SqlSession sqlSession;

    public int insertIngredient(Ingredient ingredient) {
        System.out.println("===> JDBC로 insertBoard() 기능 처리");
        try {
            return sqlSession.insert("Ingredient.insertIngredient", ingredient);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    // 글 삭제
    public int deleteIngredient(int ingredientId) {
        System.out.println("===> JDBC로 deleteBoard() 기능 처리");
        try {
            return sqlSession.delete("Ingredient.deleteIngredient", ingredientId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int updateIngredient(Ingredient ingredient) {
        System.out.println("===> JDBC updateIngredient");
        try {
            return sqlSession.update("Ingredient.updateIngredient", ingredient);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public Ingredient getIngredient(int ingredientId) {
        System.out.println("===> JDBC getIngredient");
        try {
            return sqlSession.selectOne("Ingredient.getIngredient", ingredientId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Ingredient> getIngredientList(int recipeId){
        List<Ingredient> list = new ArrayList<Ingredient>();
        System.out.println("===> JDBC getIngredientList");
        return sqlSession.selectList("Ingredient.getIngredientList", recipeId);
    }
}
