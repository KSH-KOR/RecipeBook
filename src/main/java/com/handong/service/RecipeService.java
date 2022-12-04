package com.handong.service;

import com.handong.dao.RecipeDao;
import com.handong.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService implements BoardServiceInterface{

    @Autowired
    RecipeDao recipeDao;

    @Override
    public int insertPost(Object model) {
        return recipeDao.insertBoard((Recipe) model);
    }

    @Override
    public int deletePost(int id) {
        return recipeDao.deleteBoard(id);
    }

    @Override
    public int updatePost(Object model) {
        return recipeDao.updateBoard((Recipe) model);
    }

    @Override
    public Object getPost(int id) {
        return recipeDao.getBoard(id);
    }

    @Override
    public List<Object> getPostList() {
        return null;
    }
}
