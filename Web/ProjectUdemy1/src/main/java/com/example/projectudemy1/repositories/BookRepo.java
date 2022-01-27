package com.example.projectudemy1.repositories;

import com.example.projectudemy1.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {

}
