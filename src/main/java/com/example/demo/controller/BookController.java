package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BookDAO;
import com.example.demo.entity.Book;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*")
public class BookController {

	@Autowired
	private BookDAO dao;
	
	@GetMapping
	public List<Book> list(){
		return dao.findAll();
	}
	@PostMapping
	public String save(Book book) {
		dao.save(book);
		return "OK";
	}
}
