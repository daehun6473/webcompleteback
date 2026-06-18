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
    public Map<String, Object> getBookList(Map<String, Object> param) {
        List<Book> list = bookMapper.getBookList(param);
        int totalCount = bookMapper.getBookListCount(param);

        Map<String, Object> result = new HashMap<>();
        result.put("books", list);
        result.put("totalCount", totalCount);

        return result;

    }

    @Override
    public List<Book> getBookDetail(Map<String, Object> param) {

        return bookMapper.getBookDetail(param);

    }


    @Override
    public void insertBook(Map<String, Object> params) {

            bookMapper.insertBook(params);

    }

    @Override
    public void deleteBook(Map<String, Object> params) {

        bookMapper.deleteBook(params);

    }

    @Override
    public void updateBook(Map<String, Object> params) {

        bookMapper.updateBook(params);

    }
}