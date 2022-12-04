package com.handong.service;

import com.handong.model.Recipe;

import java.util.List;

public interface BoardServiceInterface {
    public int insertPost(Object model);
    public int deletePost(int id);
    public int updatePost(Object model);
    public Object getPost(int id);
    public List<Object> getPostList();
}