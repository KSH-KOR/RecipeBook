package com.handong.controllers;

import com.handong.model.Recipe;
import com.handong.service.IngredientService;
import com.handong.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/recipe")
public class RecipeController {
    @Autowired
    RecipeService recipeService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String recipeList(Model model){
        model.addAttribute("recipeList", recipeService.getPostList());
        return "list";
    }

    @RequestMapping(value = "/addRecipe", method = RequestMethod.GET)
    public String addRecipe(){
        return "addRecipeForm";
    }

    @RequestMapping(value = "/editRecipe/{id}", method = RequestMethod.GET)
    public String editRecipe(@PathVariable("id") int id, Model model){
        Recipe postModel = (Recipe) recipeService.getPost(id);
        model.addAttribute("editRecipeInfo", postModel);
        return "editRecipeForm";
    }

    @RequestMapping(value = "/addRecipeOk", method = RequestMethod.POST)
    public String addRecipeOk(Recipe postModel){
        if(recipeService.insertPost(postModel) == 0){
            System.out.println("데이터 추가 실패");
        } else{
            System.out.println("데이터 추가 성공");
        }
        return "redirect:list";
    }
    @RequestMapping(value = "/editRecipeOk", method = RequestMethod.POST)
    public String editRecipeOk(Recipe postModel){
        if(recipeService.updatePost(postModel) == 0){
            System.out.println("데이터 수정 실패");
        } else{
            System.out.println("데이터 수정 성공");
        }
        return "redirect:list";
    }

    @RequestMapping(value = "/deleteRecipe/{id}", method = RequestMethod.GET)
    public String deleteRecipe(@PathVariable("id") int id){
        if(recipeService.deletePost(id) == 0){
            System.out.println("데이터 삭제 실패");
        } else{
            System.out.println("데이터 삭제 성공");
        }

        return "redirect:../list";
    }
}
