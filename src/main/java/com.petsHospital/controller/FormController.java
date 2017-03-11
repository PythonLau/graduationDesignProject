package com.petsHospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/11 0011.
 */
@Controller
public class FormController {
    @RequestMapping(value="/{formName}")
    public String loginForm(@PathVariable String formName){
        return formName;
    }
}
