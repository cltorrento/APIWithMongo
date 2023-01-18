package com.torrento.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "ingreso")
public class Book {

    @Id
    private Integer _id;
    private String name;
    private String author;
    private String isbn;

}
