package com.dapi.FirstWeb.controllers;

import com.dapi.FirstWeb.repositories.IBookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BookController {

    /*private final IBookRepository bookRepository;

    public BookController(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
     */

    @RequestMapping(value="/books")
    public String getBooks(){

        //model.addAttribute("books",bookRepository.findAll());

        //return "books/list";
        return "test";
    }
}
