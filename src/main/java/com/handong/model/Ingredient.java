package com.handong.model;

import com.handong.constant.DatabaseFieldName;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ingredient {
    private  int ingredientID;
    private  int recipeID;
    private  String name;
    private  String unit;
    private  String weight;
    private  Date createdTime;

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
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

    public Ingredient(int ingredientID, int recipeID, String name, String unit, String weight, Date createdTime, Date lastModifiedTime) {
        this.ingredientID = ingredientID;
        this.recipeID = recipeID;
        this.name = name;
        this.unit = unit;
        this.weight = weight;
        this.createdTime = createdTime;
        this.lastModifiedTime = lastModifiedTime;
    }
    public Ingredient(ResultSet rs) throws SQLException {
        this.ingredientID = rs.getInt(DatabaseFieldName.ingredientIdFieldName);;
        this.recipeID = rs.getInt(DatabaseFieldName.recipeIdFieldName);
        this.name = rs.getString(DatabaseFieldName.ingredientNameFieldName);
        this.unit = rs.getString(DatabaseFieldName.ingredientUnitFieldName);;
        this.weight = rs.getString(DatabaseFieldName.ingredientWeightFieldName);;
        this.createdTime = rs.getDate(DatabaseFieldName.ingredientCreatedTimeFieldName);;
        this.lastModifiedTime = rs.getDate(DatabaseFieldName.ingredientLastModifiedTimeFieldName);;
    }

    public int getIngredientID() {
        return ingredientID;
    }

    public int getRecipeID() {
        return recipeID;
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
