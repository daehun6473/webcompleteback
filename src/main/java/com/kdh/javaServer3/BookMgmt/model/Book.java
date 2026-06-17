package com.kdh.javaServer3.BookMgmt.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class Book {
    //booksList
    private String bookNo; //도서기호
    private String title; // 도서명
    private String author; //저자
    private String publisher; //출판사
    private String pubDate; //발행년
    private String regDate; // 등록일
    private String state; // 소장상태
    private String dataType; // 자료구분

    //book detail
    // -> 공통 제공 bookNo, title, author, publisher, pubdate, regDate, state
    //상세제공
    private String libNo; // 기관번호
    private String posi; // 별치기호
    private String clas; //분류기호
    private String auth; // 도서기호
    private String vol; // 권책기호
    private String price; //가격

    private String markNo;
    private String bookId;
    private String bookSec;

}
