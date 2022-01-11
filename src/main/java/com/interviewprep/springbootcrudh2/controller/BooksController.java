package com.interviewprep.springbootcrudh2.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.interviewprep.springbootcrudh2.model.Books;
import com.interviewprep.springbootcrudh2.service.BooksService;  
  
/**
 * 
 * @author Admin
 *
 */
@RestController  
public class BooksController   
{  
//autowire the BooksService class  
@Autowired  
BooksService booksService;  
//creating a get mapping that retrieves all the books detail from the database   

private static final Logger LOGGER=LoggerFactory.getLogger(BooksController.class);

@GetMapping("/book")  
private List<Books> getAllBooks()   
{  
	LOGGER.info("get book result");
	return booksService.getAllBooks();  

}  
/**
 *  
 * @param bookid
 * @return
 */
@GetMapping("/book/{bookid}")  
private Books getBooks(@PathVariable("bookid") int bookid)   
{  
return booksService.getBooksById(bookid);  
}  
//creating a delete mapping that deletes a specified book  
@DeleteMapping("/book/{bookid}")  
private ResponseEntity<Books> deleteBook(@PathVariable("bookid") int bookid)   
{  
booksService.delete(bookid); 
return new ResponseEntity<Books>(HttpStatus.OK);
}  
/**
 *  
 * @param books
 * @return integer if book is saved successfully it will return 1
 */
@PostMapping("/books")  
private int saveBook(@RequestBody Books books)   
{  
booksService.saveOrUpdate(books);  
return books.getBookid();  
}  
/**
 *   
 * @param books
 * @return Return books object
 */
@PutMapping("/books")  
private Books update(@RequestBody Books books)   
{  
booksService.saveOrUpdate(books);  
return books;  
}  
}  