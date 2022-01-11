package com.interviewprep.springbootcrudh2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.interviewprep.springbootcrudh2.model.Books;
@Repository
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
} 