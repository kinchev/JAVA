package com.example.projectudemy1.repositories;

import com.example.projectudemy1.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author,Long> {
}
