package com.handong.model;

import com.handong.constant.DatabaseFieldName;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ingredient {
    private final int ingredientID;
    private final int recipeID;
    private final String name;
    private final String unit;
    private final String weight;
    private final Date createdTime;
    private final Date lastModifiedTime;

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
