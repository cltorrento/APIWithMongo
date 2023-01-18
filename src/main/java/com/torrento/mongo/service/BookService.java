package com.torrento.mongo.service;

import com.torrento.mongo.model.Book;
import com.torrento.mongo.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<Book> getAll(){
        return bookRepository.findAll();
    }

    public void saveDocument(Book book){
        bookRepository.save(book);
    }


}
