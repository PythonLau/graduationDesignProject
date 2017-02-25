package com.petsHospital.Controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/2/24 0024.
 */
@Controller
public class HelloController {
    private static final Log logger = LogFactory.getLog(HelloController.class);
    @RequestMapping(value = "/hello")
    public ModelAndView hello(){
        logger.info("hello 方法 被调用");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","Hello World");
        mv.setViewName("welcome.jsp");
        return mv;
    }
}
