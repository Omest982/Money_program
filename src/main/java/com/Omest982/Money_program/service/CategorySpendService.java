package com.Omest982.Money_program.service;

import com.Omest982.Money_program.model.CategorySpend;

import java.util.List;

public interface CategorySpendService {
    public CategorySpend saveCategorySpend(CategorySpend categorySpend);
    public List<CategorySpend> getAllCategorySpends();
    public CategorySpend getById(long id);
    public List<CategorySpend> getByUserId(long user_id);
}
