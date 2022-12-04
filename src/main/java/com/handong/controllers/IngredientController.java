package com.handong.controllers;

import com.handong.model.Ingredient;
import com.handong.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/recipe/{recipeId}/ingredient")
public class IngredientController {
    @Autowired
    IngredientService ingredientService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String ingredientList(@PathVariable("recipeId") int id, Model model){
        model.addAttribute("ingredientList", ingredientService.getPostList(id));
        return "list";
    }

    @RequestMapping(value = "/addIngredient", method = RequestMethod.GET)
    public String addIngredient(@PathVariable("recipeId") int id, Model model){
        model.addAttribute("recipeId", id);
        return "addIngredientForm";
    }

    @RequestMapping(value = "/editIngredient/{ingredientId}", method = RequestMethod.GET)
    public String editIngredient(@PathVariable("ingredientId") int id, Model model){
        Ingredient ingredient = (Ingredient) ingredientService.getPost(id);
        model.addAttribute("editIngredientInfo", ingredient);
        return "editIngredientForm";
    }

    @RequestMapping(value = "/addIngredientOk", method = RequestMethod.POST)
    public String addIngredientOk(@PathVariable("recipeId") int id, Ingredient ingredient){
        if(ingredientService.insertPost(ingredient, id) == 0){
            System.out.println("데이터 추가 실패");
        } else{
            System.out.println("데이터 추가 성공");
        }
        return "redirect:list";
    }
    @RequestMapping(value = "/editIngredientOk", method = RequestMethod.POST)
    public String editIngredientOk(Ingredient ingredient){
        if(ingredientService.updatePost(ingredient) == 0){
            System.out.println("데이터 수정 실패");
        } else{
            System.out.println("데이터 수정 성공");
        }
        return "redirect:list";
    }

    @RequestMapping(value = "/deleteIngredient/{id}", method = RequestMethod.GET)
    public String deleteIngredient(@PathVariable("id") int id){
        if(ingredientService.deletePost(id) == 0){
            System.out.println("데이터 삭제 실패");
        } else{
            System.out.println("데이터 삭제 성공");
        }

        return "redirect:../list";
    }
}
