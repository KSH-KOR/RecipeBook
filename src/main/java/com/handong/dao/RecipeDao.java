package com.handong.dao;

import com.handong.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.handong.constant.DatabaseFieldName;

@Repository
public class RecipeDao {
    @Autowired
    private JdbcTemplate template;
    public void setTemplate(JdbcTemplate template){
        this.template = template;
    }
    final String tableName = "Recipe";

    private final String BOARD_INSERT =
            String.format("insert into %s (%s, %s, %s, %s) values (?,?,?,?)",
                    tableName,
                    DatabaseFieldName.recipeNameFieldName,
                    DatabaseFieldName.recipeRatingFieldName,
                    DatabaseFieldName.recipeCategoryFieldName,
                    DatabaseFieldName.recipeDescriptionFieldName
            );
    private final String BOARD_UPDATE =
            String.format("update %s set %s=?, %s=?, %s=?, %s=? where %s=?",
                    tableName,
                    DatabaseFieldName.recipeNameFieldName,
                    DatabaseFieldName.recipeRatingFieldName,
                    DatabaseFieldName.recipeCategoryFieldName,
                    DatabaseFieldName.recipeDescriptionFieldName,
                    DatabaseFieldName.recipeIdFieldName
            );
    private final String BOARD_DELETE =
            String.format("delete from %s where %s=?",
                    tableName,
                    DatabaseFieldName.recipeIdFieldName
            );
    private final String BOARD_GET =
            String.format("select * from %s where %s=?",
                    tableName,
                    DatabaseFieldName.recipeIdFieldName
            );
    private final String BOARD_LIST =
            String.format("select * from %s order by %s desc",
                    tableName,
                    DatabaseFieldName.recipeIdFieldName
            );

    public int insertBoard(Recipe recipe) {
        System.out.println("===> JDBC로 insertBoard() 기능 처리");
        try {
            return template.update(BOARD_INSERT, new Object[]{recipe.getName(), recipe.getRating(), recipe.getCategory(), recipe.getDescription()});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    // 글 삭제
    public int deleteBoard(int recipeID) {
        System.out.println("===> JDBC로 deleteBoard() 기능 처리");
        try {
            return template.update(BOARD_DELETE, new Object[]{recipeID});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int updateBoard(Recipe recipe) {
        System.out.println("===> JDBC로 updateBoard() 기능 처리");
        try {
            return template.update(BOARD_UPDATE, new Object[]{recipe.getName(), recipe.getRating(), recipe.getCategory(), recipe.getDescription(), recipe.getRecipeID()});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public Recipe getBoard(int recipeId) {
        System.out.println("===> JDBC로 getBoard() 기능 처리");
        try {
            return template.queryForObject(BOARD_GET, new Object[]{recipeId}, new BeanPropertyRowMapper<Recipe>(Recipe.class));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Recipe> getBoardList(){
        List<Recipe> list = new ArrayList<Recipe>();
        System.out.println("===> JDBC로 getBoardList() 기능 처리");
        return template.query(BOARD_LIST, new RecipeRowMapper());
    }
}

class RecipeRowMapper implements RowMapper<Recipe> {

    @Override
    public Recipe mapRow(ResultSet rs, int i) throws SQLException {
        return new Recipe(rs);
    }
}
