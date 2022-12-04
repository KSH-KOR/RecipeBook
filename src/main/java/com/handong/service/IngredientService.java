package com.handong.service;

import com.handong.dao.IngredientDao;
import com.handong.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IngredientService implements IngredientServiceInterface{

    @Autowired
    IngredientDao ingredientDao;

    @Override
    public int insertPost(Ingredient model, int recipeId) {
        return ingredientDao.insertIngredient(model, recipeId);
    }

    @Override
    public int deletePost(int id) {
        return ingredientDao.deleteIngredient(id);
    }

    @Override
    public int updatePost(Ingredient model) {
        return ingredientDao.updateIngredient(model);
    }

    @Override
    public Ingredient getPost(int id) {
        return ingredientDao.getIngredient(id);
    }

    @Override
    public List<Ingredient> getPostList(int recipeId) {
        return ingredientDao.getIngredientList(recipeId);
    }
}
