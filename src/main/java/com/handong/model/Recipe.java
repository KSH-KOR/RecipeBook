package com.handong.model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.handong.constant.DatabaseFieldName;

public class Recipe {
    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    private int recipeId;
    private String name;
    private int rating;
    private String category;
    private String description;
    private Date createdTime;
    private Date lastModifiedTime;

    public Recipe(){}

    public Recipe(int recipeId, String name, int rating, String category, String description, Date createdTime, Date lastModifiedTime) {
        this.recipeId = recipeId;
        this.name = name;
        this.rating = rating;
        this.category = category;
        this.description = description;
        this.createdTime = createdTime;
        this.lastModifiedTime = lastModifiedTime;
    }

    public Recipe(ResultSet rs) throws SQLException {
        this.recipeId = rs.getInt(DatabaseFieldName.recipeIdFieldName);
        this.name = rs.getString(DatabaseFieldName.recipeNameFieldName);
        this.rating = rs.getInt(DatabaseFieldName.recipeRatingFieldName);
        this.category = rs.getString(DatabaseFieldName.recipeCategoryFieldName);
        this.description = rs.getString(DatabaseFieldName.recipeDescriptionFieldName);
        this.createdTime = rs.getDate(DatabaseFieldName.recipeCreatedTimeFieldName);
        this.lastModifiedTime = rs.getDate(DatabaseFieldName.recipeLastModifiedTimeFieldName);
    }

    public int getRecipeId() {
        return recipeId;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }
}
