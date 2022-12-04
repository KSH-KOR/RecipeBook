package com.handong.dao;

import com.handong.constant.DatabaseFieldName;
import com.handong.model.Ingredient;
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


@Repository
public class IngredientDao {
    @Autowired
    private JdbcTemplate template;
    public void setTemplate(JdbcTemplate template){
        this.template = template;
    }

    private final String tableName = "Ingredient";
    private final String BOARD_INSERT =
            String.format("insert into %s (%s, %s, %s, %s) values (?,?,?,?)",
                    tableName,
                    DatabaseFieldName.recipeIdFieldName,
                    DatabaseFieldName.ingredientNameFieldName,
                    DatabaseFieldName.ingredientUnitFieldName,
                    DatabaseFieldName.ingredientWeightFieldName
            );
    private final String BOARD_UPDATE =
            String.format("update %s set %s=?, %s=?, %s=? where %s=?",
                    tableName,
                    DatabaseFieldName.recipeNameFieldName,
                    DatabaseFieldName.ingredientUnitFieldName,
                    DatabaseFieldName.ingredientWeightFieldName,
                    DatabaseFieldName.ingredientIdFieldName
            );
    private final String BOARD_DELETE =
            String.format("delete from %s where %s=?",
                    tableName,
                    DatabaseFieldName.ingredientIdFieldName
            );
    private final String BOARD_GET =
            String.format("select * from %s where %s=?",
                    tableName,
                    DatabaseFieldName.ingredientIdFieldName
            );
    private final String BOARD_LIST =
            String.format("select * from %s order by %s desc",
                    tableName,
                    DatabaseFieldName.ingredientIdFieldName
            );

    public int insertBoard(Ingredient ingredient) {
        System.out.println("===> JDBC로 insertBoard() 기능 처리");
        try {
            return template.update(BOARD_INSERT, new Object[]{ingredient.getRecipeID(), ingredient.getName(), ingredient.getUnit(), ingredient.getWeight()});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    // 글 삭제
    public int deleteBoard(int ingredientId) {
        System.out.println("===> JDBC로 deleteBoard() 기능 처리");
        try {
            return template.update(BOARD_DELETE, new Object[]{ingredientId});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public int updateBoard(Ingredient ingredient) {
        System.out.println("===> JDBC로 updateBoard() 기능 처리");
        try {
            return template.update(BOARD_UPDATE, new Object[]{ingredient.getName(), ingredient.getUnit(), ingredient.getWeight(), ingredient.getRecipeID()});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public Ingredient getBoard(int ingredientId) {
        System.out.println("===> JDBC로 getBoard() 기능 처리");
        try {
            return template.queryForObject(BOARD_GET, new Object[]{ingredientId}, new BeanPropertyRowMapper<Ingredient>(Ingredient.class));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Ingredient> getBoardList(){
        List<Ingredient> list = new ArrayList<Ingredient>();
        System.out.println("===> JDBC로 getBoardList() 기능 처리");
        return template.query(BOARD_LIST, new IngredientRowMapper());
    }
}

class IngredientRowMapper implements RowMapper<Ingredient> {

    @Override
    public Ingredient mapRow(ResultSet rs, int i) throws SQLException {
        return new Ingredient(rs);
    }
}