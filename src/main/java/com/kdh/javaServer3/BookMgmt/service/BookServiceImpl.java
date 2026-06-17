package com.kdh.javaServer3.BookMgmt.service;

import com.kdh.javaServer3.BookMgmt.mapper.BookMapper;
import com.kdh.javaServer3.BookMgmt.model.Book;
import com.kdh.javaServer3.BookMgmt.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookMapper bookMapper;

    @Override
    public List<Book> getBookList(Map<String, Object> param) {

        return bookMapper.getBookList(param);

    }

    @Override
    public List<Book> getBookDetail(Map<String, Object> param) {

        return bookMapper.getBookDetail(param);

    }


        @Override
        public void insertBook(Map<String, Object> params) {

            bookMapper.insertBook(params);

        }
}