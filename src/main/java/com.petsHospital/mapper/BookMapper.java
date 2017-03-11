package com.petsHospital.mapper;

import com.petsHospital.domain.Book;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/11 0011.
 */
@Service("bookMapper")
public interface BookMapper{
    @Select("select * from tb_book")
    List<Book> findAll();
}
