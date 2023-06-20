package com.example.hibernatespringbootjustmanytoone.repository;


import com.example.hibernatespringbootjustmanytoone.entity.Books;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface BookRepository extends JpaRepository<Books, Long> {
    @Query("SELECT b FROM Books b WHERE b.author.id = :id")
    List<Books> fetchBooksOfAuthorById(Long id);

    @Query("SELECT b FROM Books b WHERE b.author.id = :id")
    Page<Books> fetchPageBooksOfAuthorById(Long id, Pageable pageable);
}
