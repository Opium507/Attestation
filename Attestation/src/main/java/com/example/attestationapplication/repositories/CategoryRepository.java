package com.example.attestationapplication.repositories;

import com.example.attestationapplication.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    com.example.attestationapplication.models.Category findByName(String name);
}
