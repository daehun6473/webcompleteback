package com.kdh.javaServer3.BookMgmt.service;

import com.kdh.javaServer3.BookMgmt.model.Book;

import java.util.List;
import java.util.Map;

public interface BookService {

    Map<String, Object> getBookList(Map<String, Object> param);
    List<Book> getBookDetail(Map<String, Object> param);
    void insertBook(Map<String, Object> params);
    void deleteBook(Map<String, Object> params);
    void updateBook(Map<String, Object> params);
}