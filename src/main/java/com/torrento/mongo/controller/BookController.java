package com.torrento.mongo.controller;

import com.torrento.mongo.model.Book;
import com.torrento.mongo.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/books")
public class BookController {
    private final BookService bookService;

    @GetMapping("findAll")
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @PostMapping("save")
    public void saveBook(@RequestBody Book book){
       bookService.save(book);
    }
}
