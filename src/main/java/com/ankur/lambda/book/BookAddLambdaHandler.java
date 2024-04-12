package com.ankur.lambda.book;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ankur.domain.Book;
import com.ankur.domain.Employee;
import com.ankur.domain.Status;
import com.ankur.service.BookService;


public class BookAddLambdaHandler implements RequestHandler<Book, Status> {
    private BookService bookService;

    public BookAddLambdaHandler() {
        bookService = new BookService();
    }

    @Override
    public Status handleRequest(Book book, Context context) {
        return bookService.add(book);
    }
}


