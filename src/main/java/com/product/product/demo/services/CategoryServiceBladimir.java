package com.product.product.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.product.product.demo.entities.CategoryBladimir;
import com.product.product.demo.repositories.CategoryRepositoryBladimir;

@Service
public class CategoryServiceBladimir {

    @Autowired
    private CategoryRepositoryBladimir categoryRepository;

    // Create Category
    public CategoryBladimir save(CategoryBladimir category) {
        return categoryRepository.save(category);
    }

    // Read All Category
    public List<CategoryBladimir> findAll() {
        return categoryRepository.findAll();
    }

    // Read Category By ID
    public CategoryBladimir findById(long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    // Delete Category
    public void deleteById(long id) {
        categoryRepository.deleteById(id);
    }

    // Actualizado Parcial
    // ResponseEntoty maneja un solo dato, idel para acutlizar parcialmente
    public ResponseEntity<CategoryBladimir> updateById(long id, CategoryBladimir categoryUpdate) {
        try {
            // Verificacition ID
            CategoryBladimir categoryExist = findById(id);
            if (categoryExist == null)
                return ResponseEntity.notFound().build();
            // Update each field
            if (categoryUpdate.getName() != null)
                categoryExist.setName(categoryUpdate.getName());
            if (categoryUpdate.getEnable() != null)
                categoryExist.setEnable(categoryUpdate.getEnable());
            // Save data
            CategoryBladimir categorySave = save(categoryExist);
            return ResponseEntity.ok(categorySave);
            // Mensaje exceptions
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    };
}
