package dev.galileu.aulaspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.galileu.aulaspring.entity.Category;
import dev.galileu.aulaspring.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;
    
    @Transactional(readOnly = true) //Apenas se precisar usar transação e readonly se for apenas consulta
    public List<Category> findAll() {
        return repository.findAll();
    }


}
