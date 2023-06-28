package com.Omest982.Money_program.controller;

import com.Omest982.Money_program.model.Category;
import com.Omest982.Money_program.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("/add")
    public String add(@RequestBody Category category){
        categoryService.saveCategory(category);
        return "New category spend saved!";
    }

    @GetMapping("/get")
    public List<Category> getByUserId(@RequestParam long user_id){return categoryService.getByUserId(user_id);}

    @GetMapping("/{id}")
    public Category getById(@PathVariable long id){
        return categoryService.getById(id);
    }
    @GetMapping("/getAll")
    public List<Category> getAll(){
        return categoryService.getAllCategories();
    }
}
