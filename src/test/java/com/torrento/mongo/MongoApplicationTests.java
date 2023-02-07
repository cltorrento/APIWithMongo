package com.torrento.mongo;

import com.torrento.mongo.model.Book;
import com.torrento.mongo.repository.BookRepository;
import com.torrento.mongo.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class MongoApplicationTests {

	@Autowired
	public BookService bookService;
	@MockBean
	public BookRepository bookRepository;

	@Test
	public void getBooksTest() {
		when(bookRepository.findAll()).thenReturn(Stream.of(
				new Book(376, "Carlos", "Torrento", "1235212111"),
				new Book(958, "Luis", "Valdez", "U212131321K"))
				.collect(Collectors.toList()));
		assertEquals(2, bookRepository.findAll().size());
	}

}
