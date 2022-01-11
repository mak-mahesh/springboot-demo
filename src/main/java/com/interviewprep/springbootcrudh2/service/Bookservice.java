package com.interviewprep.springbootcrudh2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interviewprep.springbootcrudh2.repository.BooksRepository;

@Service
public class Bookservice {

	@Autowired  
	BooksRepository booksRepository; 

}
