package dev.galileu.aulaspring.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.galileu.aulaspring.dto.CategoryDTO;
import dev.galileu.aulaspring.entity.Category;
import dev.galileu.aulaspring.repository.CategoryRepository;
import dev.galileu.aulaspring.service.exceptions.EntityNotFoundException;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;
    
    @Transactional(readOnly = true) //Apenas se precisar usar transação e readonly se for apenas consulta
    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll();
        List<CategoryDTO> listDTO = list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
        return listDTO;
    }

    @Transactional(readOnly = true)
    public CategoryDTO findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        return new CategoryDTO(entity);
        
    }

    public CategoryDTO insert(CategoryDTO dto) {
        Category entity = new Category();
        entity.setName(dto.getName());
        entity = repository.save(entity);
        return new CategoryDTO(entity);
    }


}
