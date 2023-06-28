package com.Omest982.Money_program.service.Imp;

import com.Omest982.Money_program.model.Category;
import com.Omest982.Money_program.repository.CategoryRepository;
import com.Omest982.Money_program.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImp implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Category> getByUserId(long user_id) {
        return categoryRepository.findByUserId(user_id);
    }
}
