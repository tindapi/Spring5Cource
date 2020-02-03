package com.dapi.FirstWeb.bootstrap;


import com.dapi.FirstWeb.model.Author;
import com.dapi.FirstWeb.model.Book;
import com.dapi.FirstWeb.model.Publisher;
import com.dapi.FirstWeb.repositories.IAuthorRepository;
import com.dapi.FirstWeb.repositories.IBookRepository;
import com.dapi.FirstWeb.repositories.IPublsherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final IAuthorRepository authorRepository;
    private final IBookRepository bookRepository;
    private final IPublsherRepository publisherRepository;

    public BootStrapData(IAuthorRepository authorRepository,
                         IBookRepository bookRepository,
                         IPublsherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher("ZOP", "Am Publisher 1","Haan", "42781");
        publisherRepository.save(publisher);

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","10-10-10-10");
        ddd.setPublisher(publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod= new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development","1231231231231");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);

        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Number Authors " + authorRepository.count());
        System.out.println("Number Publisher " + publisherRepository.count());
        System.out.println("Number of Books " + bookRepository.count());
        System.out.println("Publisher Number of Books " + publisher.getBooks().size());







    }
}
