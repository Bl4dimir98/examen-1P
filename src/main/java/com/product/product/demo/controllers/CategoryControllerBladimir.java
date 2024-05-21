package com.product.product.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.product.product.demo.entities.CategoryBladimir;
import com.product.product.demo.services.CategoryServiceBladimir;

@RestController
@RequestMapping("api/v1")
@CrossOrigin({ "*" })
public class CategoryControllerBladimir {

    @Autowired
    CategoryServiceBladimir categoryService;

    // API - Create Category
    @PostMapping(value = "/categories") // Sub ruta para saber cuando guardar
    public CategoryBladimir save(@RequestBody CategoryBladimir category) { // Para Json RequestBody
        return categoryService.save(category);
    }

    // API - Find All Categories
    @GetMapping(value = "/categories")
    public List<CategoryBladimir> findAll() {
        return categoryService.findAll();
    }

    // API - Find Category By Id
    @GetMapping(value = "/categories/{id}")
    public CategoryBladimir findById(@PathVariable long id) {
        return categoryService.findById(id);
    }

    // API - Delete Category
    @DeleteMapping(value = "/categories/{id}")
    public void deleteById(@PathVariable long id) {
        categoryService.deleteById(id);
    }

    // API - Update Category
    @PutMapping(value = "/categories/{id}")
    public CategoryBladimir update(@RequestBody CategoryBladimir category) {
        return categoryService.save(category);
    }

    // API - Parcial Update
    @PatchMapping("/categories/{id}")
    public ResponseEntity<CategoryBladimir> updateById(@PathVariable long id, @RequestBody CategoryBladimir category) {
        return categoryService.updateById(id, category);
    };
}
