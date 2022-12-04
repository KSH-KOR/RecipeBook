package com.handong.service;

import com.handong.dao.RecipeDao;
import com.handong.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService implements RecipeServiceInterface {

    @Autowired
    RecipeDao recipeDao;

    @Override
    public int insertPost(Recipe model) {
        return recipeDao.insertRecipe(model);
    }

    @Override
    public int deletePost(int id) {
        return recipeDao.deleteRecipe(id);
    }

    @Override
    public int updatePost(Recipe model) {
        return recipeDao.updateRecipe(model);
    }

    @Override
    public Recipe getPost(int id) {
        return recipeDao.getRecipe(id);
    }

    @Override
    public List<Recipe> getPostList() {
        return recipeDao.getRecipeList();
    }
}
