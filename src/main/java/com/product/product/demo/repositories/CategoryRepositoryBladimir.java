package com.product.product.demo.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.product.product.demo.entities.CategoryBladimir;

public interface CategoryRepositoryBladimir extends CrudRepository<CategoryBladimir, Long> {
        @SuppressWarnings("null")
        List<CategoryBladimir> findAll();
}
