package com.ankur.lambda.book;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ankur.domain.Book;
import com.ankur.service.BookService;

import java.util.List;


public class BookAllLambdaHandler implements RequestHandler<Object, List<Book>> {
    private BookService bookService;

    public BookAllLambdaHandler() {
        bookService = new BookService();
    }

    @Override
    public List<Book> handleRequest(Object obj, Context context) {
        return bookService.all();
    }
}


