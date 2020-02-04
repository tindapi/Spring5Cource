package com.dapi.FirstWeb.repositories;

import com.dapi.FirstWeb.model.Book;
import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;

public interface IBookRepository extends CrudRepository<Book,Long> {
}
