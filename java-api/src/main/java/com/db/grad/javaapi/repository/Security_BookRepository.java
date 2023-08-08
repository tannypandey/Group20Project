package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Security_Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Security_BookRepository extends JpaRepository<Security_Book, Integer> {

    @Query(nativeQuery = true, value = "select security.id, security.status, security.type, security.currency, " +
            "security.cusip, book.name from security join book on " +
            "security.id = book.id where name like :book_name")
    List<Security_Book> findByBookName(String book_name);

//    @Query(nativeQuery = true, value = "select id, status, type, currency, cusip from security")


    @Query(nativeQuery = true, value = "select security.id, security.status, security.type, security.currency, " +
            "security.cusip, book.name from security join book on " +
            "security.id = book.id")
    List<Security_Book> getAllBooks();



}
