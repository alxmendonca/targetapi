package com.target.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.target.api.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
