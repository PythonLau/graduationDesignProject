package com.petsHospital.controller;

import com.petsHospital.domain.Book;
import com.petsHospital.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2017/3/11 0011.
 */
@Controller
public class BookController{
    @Autowired
    @Qualifier("bookService")
    private BookService bookService;
    @RequestMapping(value="/main")
    public String main(Model model){
        List<Book> book_list = bookService.getAll();
        model.addAttribute("book_list",book_list);
        return "main";
    }
}
