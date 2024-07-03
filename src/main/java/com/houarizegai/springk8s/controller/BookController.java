package com.houarizegai.springk8s.controller;

import com.houarizegai.springk8s.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<List<BookDto>> getBooks() {
        var books = Arrays.asList(
                new BookDto("Spring Boot", "Houari ZEGAI", "123456789"),
                new BookDto("Spring Cloud", "Mohamed Omar", "123456788"),
                new BookDto("Spring Data", "Amine Ali", "123456787")
        );
        return ResponseEntity.ok(books);
    }
}

