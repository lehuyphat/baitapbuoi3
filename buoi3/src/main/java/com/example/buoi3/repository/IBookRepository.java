
package com.example.buoi3.repository;
import com.example.buoi3.entity.Book;
import
        org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
