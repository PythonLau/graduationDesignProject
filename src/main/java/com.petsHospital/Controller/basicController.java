package com.petsHospital.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/1 0001.
 */
@Controller
public class basicController {
    @RequestMapping(value="/{viewName}")
    public String requestView(@PathVariable String viewName){
        return viewName;
    }
}
