package com.kdh.javaServer3.BookMgmt.controller;

import com.kdh.javaServer3.BookMgmt.model.Book;
import com.kdh.javaServer3.BookMgmt.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class BookController {

    private final BookService bookService;


    @GetMapping("/books")
    public List<Book> getBookList(
            @RequestParam(required = false) String bookNm) {

        Map<String, Object> param = new HashMap<>();

        param.put("bookNm", bookNm);

        return bookService.getBookList(param);
    }

    @GetMapping("/bookDetail")
    public List<Book> getBookDetail(
            @RequestParam(required = false) String bookNo) {

        Map<String, Object> param = new HashMap<>();

        param.put("bookNo", bookNo);

        return bookService.getBookDetail(param);
    }

    @PostMapping("/insertBook")
    public ResponseEntity<List<Book>> insertBook(@RequestBody Book book){
        try{
            Map<String, Object> params = new HashMap<>();
            params.put("title", book.getTitle()); //자료명
            params.put("author",book.getAuthor()); // 저자명
            params.put("publisher", book.getPublisher()); //발행처
            params.put("pubDate", book.getPubDate()); //발행년
            params.put("libNo", book.getLibNo()); //기관번호
            params.put("markNo", book.getMarkNo()); // 자료마크 넘버
            params.put("posi", book.getPosi()); // 별치기호
            params.put("clas", book.getClas()); // 분류기호
            params.put("auth", book.getAuth()); // 도서기호
            params.put("vol", book.getVol()); // 권책기호
            params.put("price", book.getPrice()); // 가격
            params.put("state", book.getState()); // 소장 상태
            params.put("bookId", book.getBookId()); //고유 아이디
            params.put("bookSec", book.getBookSec()); // 관리구분
            params.put("dataType", book.getDataType()); //자료 구분

            bookService.insertBook(params);
            return ResponseEntity.ok().build();

        }catch(Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }
}