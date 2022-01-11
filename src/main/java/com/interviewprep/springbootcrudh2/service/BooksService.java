package com.interviewprep.springbootcrudh2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewprep.springbootcrudh2.model.Books;
import com.interviewprep.springbootcrudh2.repository.BooksRepository;  
 
/**
 *   
 * @author Admin
 *
 */
@Service  
public class BooksService   
{  
@Autowired  
BooksRepository booksRepository;  
/**
 *   
 * @return Book object List
 */
public List<Books> getAllBooks()   
{  
List<Books> books = new ArrayList<Books>();  
booksRepository.findAll().forEach(books1 -> books.add(books1));  
return books;  
}  
/**
 * 
 * @param id get book object of specific id
 * @return book object is returned
 */
public Books getBooksById(int id)   
{  
return booksRepository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Books books)   
{  
booksRepository.save(books);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
booksRepository.deleteById(id);  
}  
//updating a record  
public void update(Books books, int bookid)   
{  
booksRepository.save(books);  
}  
}  
