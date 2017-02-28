package com.petsHospital.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.petsHospital.domain.Book;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/2/27 0027.
 */
@Controller
public class BookController{
    private static final Log logger = LogFactory.getLog(BookController.class);
    @RequestMapping(value="/testRequestBody")
    public void testRequestBody(@RequestBody Book book, HttpServletResponse response) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        logger.info(mapper.writeValueAsString(book));
        book.setAuthor("肖文吉");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(mapper.writeValueAsString(book));
    }
}
