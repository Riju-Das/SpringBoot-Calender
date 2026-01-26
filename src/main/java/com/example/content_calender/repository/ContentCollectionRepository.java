package com.example.content_calender.repository;

import org.springframework.stereotype.Repository;
import com.example.content_calender.model.Content;

import java.util.*;

@Repository
public class ContentCollectionRepository {
    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository(){

    }

    public List<Content> findAll(){
        return content;
    }

    public Optional<Content> findById(Integer id){
        return content.stream().filter(c->c.id().equals(id)).findFirst();
    }
}