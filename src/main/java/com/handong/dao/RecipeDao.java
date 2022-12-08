package com.handong.dao;

import com.handong.model.Recipe;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.handong.constant.DatabaseFieldName;

@Repository
public class RecipeDao {
    @Autowired
    SqlSession sqlSession;
    final String tableName = "Recipe";

    public int insertRecipe(Recipe recipe) {
        System.out.println("===> JDBC로 insertBoard() 기능 처리");
        try {
            return sqlSession.insert("Recipe.insertRecipe", recipe);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    // 글 삭제
    public int deleteRecipe(int recipeID) {
        System.out.println("===> JDBC로 deleteBoard() 기능 처리");
        try {
            return sqlSession.delete("Recipe.deleteRecipe");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int updateRecipe(Recipe recipe) {
        System.out.println("===> JDBC로 updateBoard() 기능 처리");
        try {
            return sqlSession.update("Recipe.updateRecipe", recipe);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public Recipe getRecipe(int recipeId) {
        System.out.println("===> JDBC로 getBoard() 기능 처리");
        try {
            return sqlSession.selectOne("Recipe.getRecipe");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Recipe> getRecipeList(){
        System.out.println("===> JDBC로 getBoardList() 기능 처리");
        return sqlSession.selectList("Recipe.getRecipeList");
    }
}