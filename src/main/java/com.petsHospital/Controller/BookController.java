package com.petsHospital.Controller;

import com.petsHospital.domain.Book;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;


/**
 * Created by Administrator on 2017/2/27 0027.
 */
@Controller
public class BookController{
    private static final Log logger = LogFactory.getLog(BookController.class);
    @RequestMapping(value ="/sendxml",method = RequestMethod.POST)
    public void sendxml(@RequestBody Book book){
        logger.info(book);
        logger.info("接收XML数据成功");
    }
    @RequestMapping(value="/readxml",method = RequestMethod.POST)
    public @ResponseBody Book readXml() throws Exception{
        JAXBContext context = JAXBContext.newInstance(Book.class);
        Unmarshaller unmar = context.createUnmarshaller();
        InputStream is = this.getClass().getResourceAsStream("D:\\Java\\myJavaCode\\graduationDesignProject\\src\\test\\java\\Book.xml");
        Book book = (Book)unmar.unmarshal(is);
        logger.info(book);
        return book;
    }
}
