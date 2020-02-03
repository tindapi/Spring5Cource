package com.dapi.FirstWeb.bootstrap;


import com.dapi.FirstWeb.model.Author;
import com.dapi.FirstWeb.model.Book;
import com.dapi.FirstWeb.repositories.IAuthorRepository;
import com.dapi.FirstWeb.repositories.IBookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private IAuthorRepository authorRepository;
    private IBookRepository bookRepository;

    public BootStrapData(IAuthorRepository authorRepository, IBookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","10-10-10-10");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod= new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development","1231231231231");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books " + bookRepository.count());



    }
}
