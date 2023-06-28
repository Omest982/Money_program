package com.Omest982.Money_program.repository;

import com.Omest982.Money_program.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    public List<Category> findByUserId(long user_id);
}
