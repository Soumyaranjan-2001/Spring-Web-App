package com.ashokit.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ashokit.entity.Book;
import com.ashokit.repository.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository repo;
	
	@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id")Integer id){
		
		ModelAndView mav = new ModelAndView();
		Optional<Book> findById = repo.findById(id);
		if(findById.isPresent()) {
			Book bookobj = findById.get();
			
			//  Sending data to view // 
			mav.addObject("book", bookobj);
		}
		
		// Setting View Page Name // 
		mav.setViewName("index");
		return mav;
		
	}
}
