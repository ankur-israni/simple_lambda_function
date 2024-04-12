package com.ankur.service;

import com.ankur.domain.Book;
import com.ankur.domain.Status;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.ankur.domain.Status.*;

public class BookService {

    private Map<Integer,Book> db = new HashMap<>();

    public BookService(){
        db.put(1,new Book(1,"The Great Gatsby","F. Scott Fitzgerald"));
        db.put(2,new Book(2,"The Sound and the Fury","William Faulkner"));
        db.put(3,new Book(3,"To the Lighthouse","Virginia Woolf"));
    }


    public Status add(Book book){
        Book bk = findById(book.getId());
        if(bk==null){
            db.put(book.getId(),book);
            return SUCCESS;
        }
        return FAILURE;
    }

    public Status remove(int id){
        Book book = findById(id);
        if(book!=null){
            db.remove(id);
            return SUCCESS;
        }
        return FAILURE;
    }

    public Book findById(int id){
        return db.get(id);
    }

    public List<Book> all(){
       return db.values().stream().collect(Collectors.toList());
    }


    //"statusCode": 200,

}
