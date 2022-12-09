package com.handong.model;

import com.handong.constant.DatabaseFieldName;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ingredient {
    private  int ingredientId;
    private  int recipeId;
    private  String name;
    private  String unit;
    private  String weight;
    private  Date createdTime;

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    private  Date lastModifiedTime;

    public Ingredient(){}

    public Ingredient(int ingredientId, int recipeId, String name, String unit, String weight, Date createdTime, Date lastModifiedTime) {
        this.ingredientId = ingredientId;
        this.recipeId = recipeId;
        this.name = name;
        this.unit = unit;
        this.weight = weight;
        this.createdTime = createdTime;
        this.lastModifiedTime = lastModifiedTime;
    }
    public Ingredient(ResultSet rs) throws SQLException {
        this.ingredientId = rs.getInt(DatabaseFieldName.ingredientIdFieldName);;
        this.recipeId = rs.getInt(DatabaseFieldName.recipeIdFieldName);
        this.name = rs.getString(DatabaseFieldName.ingredientNameFieldName);
        this.unit = rs.getString(DatabaseFieldName.ingredientUnitFieldName);;
        this.weight = rs.getString(DatabaseFieldName.ingredientWeightFieldName);;
        this.createdTime = rs.getDate(DatabaseFieldName.ingredientCreatedTimeFieldName);;
        this.lastModifiedTime = rs.getDate(DatabaseFieldName.ingredientLastModifiedTimeFieldName);;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public String getWeight() {
        return weight;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }
}
