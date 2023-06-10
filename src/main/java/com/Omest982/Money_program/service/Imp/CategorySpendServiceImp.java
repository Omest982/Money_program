package com.Omest982.Money_program.service.Imp;

import com.Omest982.Money_program.model.CategorySpend;
import com.Omest982.Money_program.repository.CategorySpendRepository;
import com.Omest982.Money_program.service.CategorySpendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorySpendServiceImp implements CategorySpendService {

    private final CategorySpendRepository categorySpendRepository;

    @Autowired
    public CategorySpendServiceImp(CategorySpendRepository categorySpendRepository) {
        this.categorySpendRepository = categorySpendRepository;
    }

    @Override
    public CategorySpend saveCategorySpend(CategorySpend categorySpend) {
        return categorySpendRepository.save(categorySpend);
    }

    @Override
    public List<CategorySpend> getAllCategorySpends() {
        return categorySpendRepository.findAll();
    }

    @Override
    public CategorySpend getById(long id) {
        return categorySpendRepository.findById(id).orElse(null);
    }

    @Override
    public List<CategorySpend> getByUserId(long user_id) {
        return categorySpendRepository.findByUserId(user_id);
    }
}
