//package com.codeup.springblog.controllers;
//
//import com.codeup.springblog.repositories.BookRepository;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class BookController {
//    private BookRepository bookRepo;
//
//    public BookController(BookRepository bookRepo) {
//        this.bookRepo = bookRepo;
//    }
//
//    @GetMapping("/books")
//    public String showBooks(Model model) {
//        model.addAttribute("allBooks", bookRepo.findAll());
//        return "/books/books";
//    }
//
//}
