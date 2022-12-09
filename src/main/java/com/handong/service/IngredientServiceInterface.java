package com.handong.service;

import com.handong.model.Ingredient;

import java.util.List;

public interface IngredientServiceInterface {
    public int insertPost(Ingredient model);
    public int deletePost(int id);
    public int updatePost(Ingredient model);
    public Ingredient getPost(int id);
    public List<Ingredient> getPostList(int recipeId);
}