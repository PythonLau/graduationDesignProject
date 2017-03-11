package com.petsHospital.service.Impl;

import com.petsHospital.domain.Book;
import com.petsHospital.mapper.BookMapper;
import com.petsHospital.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/11 0011.
 */
@Service("bookService")
public class BookServiceImpl implements BookService{
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> getAll(){
        return bookMapper.findAll();
    }
}
