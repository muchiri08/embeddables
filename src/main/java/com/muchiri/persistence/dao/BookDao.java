package com.muchiri.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muchiri.persistence.domain.Book;

public interface BookDao extends JpaRepository<Book, Long> {

}
