
package com.example.bookconsumer;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class BookConsumer {

    @GetMapping("/books/{id}")
    public String getBook(@PathVariable int id) {

        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8080/api/books/" + id;

        return restTemplate.getForObject(url, String.class);
    }
}
