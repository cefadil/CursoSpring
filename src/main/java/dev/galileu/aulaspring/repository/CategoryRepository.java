package dev.galileu.aulaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.galileu.aulaspring.entity.Category;
@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {
    
}
