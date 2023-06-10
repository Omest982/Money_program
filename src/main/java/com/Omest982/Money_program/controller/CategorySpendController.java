package com.Omest982.Money_program.controller;

import com.Omest982.Money_program.model.CategorySpend;
import com.Omest982.Money_program.service.CategorySpendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorySpend")
@CrossOrigin
public class CategorySpendController {
    @Autowired
    CategorySpendService categorySpendService;

    @PostMapping("/add")
    public String add(@RequestBody CategorySpend categorySpend){
        categorySpendService.saveCategorySpend(categorySpend);
        return "New category spend saved!";
    }

    @GetMapping("/get")
    public List<CategorySpend> getByUserId(@RequestParam long user_id){return categorySpendService.getByUserId(user_id);}

    @GetMapping("/{id}")
    public CategorySpend getById(@PathVariable long id){
        return categorySpendService.getById(id);
    }
    @GetMapping("/getAll")
    public List<CategorySpend> getAll(){
        return categorySpendService.getAllCategorySpends();
    }
}
