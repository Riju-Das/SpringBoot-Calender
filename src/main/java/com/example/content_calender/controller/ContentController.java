package com.example.content_calender.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.content_calender.model.Content;
import com.example.content_calender.repository.ContentCollectionRepository;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/content")
public class ContentController {

    private final ContentCollectionRepository repository;

    public ContentController(ContentCollectionRepository repository){
        this.repository = repository;
    }

    @GetMapping("")
    public List<Content> findAll(){
        return repository.findAll();
    }
    
}
