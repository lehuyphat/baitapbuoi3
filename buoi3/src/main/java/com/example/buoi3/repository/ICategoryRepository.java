package com.example.buoi3.repository;


import com.example.buoi3.entity. Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype. Repository;
@Repository

public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
