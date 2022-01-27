package com.example.projectudemy1.bootstrap;

import com.example.projectudemy1.domain.Author;
import com.example.projectudemy1.domain.Book;
import com.example.projectudemy1.repositories.AuthorRepo;
import com.example.projectudemy1.repositories.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;

    public BootStrapData(AuthorRepo authorRepo, BookRepo authorRepo1) {
        this.authorRepo = authorRepo;
        this.bookRepo = authorRepo1;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Viki");
        Book book = new Book("Crypto Milioner", "123");
        eric.getBooks().add(book);
        book.getAuthors().add(eric);


        authorRepo.save(eric);
        bookRepo.save(book);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "1234556");
        rod.getBooks().add(noEJB);
        book.getAuthors().add(rod);

        authorRepo.save(rod);
        bookRepo.save(noEJB);

        System.out.println("Number of Books: "+bookRepo.count());
    }
}
