package com.handong.model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.handong.constant.DatabaseFieldName;

public class Recipe {
    private final int recipeID;
    private final String name;
    private final int rating;
    private final String category;
    private final String description;
    private final Date createdTime;
    private final Date lastModifiedTime;


    public Recipe(int recipeID, String name, int rating, String category, String description, Date createdTime, Date lastModifiedTime) {
        this.recipeID = recipeID;
        this.name = name;
        this.rating = rating;
        this.category = category;
        this.description = description;
        this.createdTime = createdTime;
        this.lastModifiedTime = lastModifiedTime;
    }

    public Recipe(ResultSet rs) throws SQLException {
        this.recipeID = rs.getInt(DatabaseFieldName.recipeIdFieldName);
        this.name = rs.getString(DatabaseFieldName.recipeNameFieldName);
        this.rating = rs.getInt(DatabaseFieldName.recipeRatingFieldName);
        this.category = rs.getString(DatabaseFieldName.recipeCategoryFieldName);
        this.description = rs.getString(DatabaseFieldName.recipeDescriptionFieldName);
        this.createdTime = rs.getDate(DatabaseFieldName.recipeCreatedTimeFieldName);
        this.lastModifiedTime = rs.getDate(DatabaseFieldName.recipeLastModifiedTimeFieldName);
    }

    public int getRecipeID() {
        return recipeID;
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
