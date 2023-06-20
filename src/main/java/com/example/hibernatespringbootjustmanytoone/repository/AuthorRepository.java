package com.example.hibernatespringbootjustmanytoone.repository;


import com.example.hibernatespringbootjustmanytoone.entity.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Authors, Long> {
}
