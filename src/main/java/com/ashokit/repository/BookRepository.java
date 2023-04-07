package com.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
