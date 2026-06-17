package com.kdh.javaServer3.BookMgmt.service;

import com.kdh.javaServer3.BookMgmt.model.Book;

import java.util.List;
import java.util.Map;

public interface BookService {

    List<Book> getBookList(Map<String, Object> param);
    List<Book> getBookDetail(Map<String, Object> param);
    void insertBook(Map<String, Object> params);
}