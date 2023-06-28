package com.Omest982.Money_program.service;

import com.Omest982.Money_program.model.Category;

import java.util.List;

public interface CategoryService {
    public Category saveCategory(Category category);
    public List<Category> getAllCategories();
    public Category getById(long id);
    public List<Category> getByUserId(long user_id);
}
