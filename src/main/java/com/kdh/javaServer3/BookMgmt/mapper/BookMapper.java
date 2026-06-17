package com.kdh.javaServer3.BookMgmt.mapper;

import com.kdh.javaServer3.BookMgmt.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {

    List<Book> getBookList(Map<String, Object> params);
    List<Book> getBookDetail(Map<String, Object> params);
    void insertBook(Map<String, Object> params);

}