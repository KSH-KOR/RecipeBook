package com.handong.service;

import com.handong.model.Recipe;

import java.util.List;

public interface RecipeServiceInterface {
    public int insertPost(Recipe model);
    public int deletePost(int id);
    public int updatePost(Recipe model);
    public Recipe getPost(int id);
    public List<Recipe> getPostList();
}