package com.Omest982.Money_program.service;

import com.Omest982.Money_program.model.CategorySpend;
import com.Omest982.Money_program.model.User;
import com.Omest982.Money_program.model.Wallet;

import java.util.List;
import java.util.Optional;

public interface CategorySpendService {
    public CategorySpend saveCategorySpend(CategorySpend categorySpend);
    public List<CategorySpend> getAllCategorySpends();
    public CategorySpend getById(long id);
    public List<CategorySpend> getByUserId(long user_id);
}
