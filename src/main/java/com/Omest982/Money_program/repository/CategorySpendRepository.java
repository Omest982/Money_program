package com.Omest982.Money_program.repository;

import com.Omest982.Money_program.model.CategorySpend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorySpendRepository extends JpaRepository<CategorySpend, Long> {
    public List<CategorySpend> findByUserId(long user_id);
}
