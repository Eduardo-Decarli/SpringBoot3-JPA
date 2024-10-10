package com.example.course.services;

import com.example.course.entities.Category;
import com.example.course.entities.User;
import com.example.course.repositories.CategoryRepository;
import com.example.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorySevice {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findByID(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
