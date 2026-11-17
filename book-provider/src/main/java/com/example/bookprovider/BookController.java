
package com.example.bookprovider;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @GetMapping("/{id}")
    public Map<String, Object> getBook(@PathVariable int id) {

        if (id == 1) {
            return Map.of(
                "id", 1,
                "title", "Java Programming",
                "author", "James Gosling"
            );
        }

        throw new org.springframework.web.server.ResponseStatusException(
            org.springframework.http.HttpStatus.NOT_FOUND,
            "Book not found"
        );
    }
}
