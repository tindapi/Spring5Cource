package com.dapi.FirstWeb.repositories;

import com.dapi.FirstWeb.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface IAuthorRepository extends CrudRepository<Author,Long> {
}
