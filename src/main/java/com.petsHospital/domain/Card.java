package com.petsHospital.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
public class Card implements Serializable {
    private Integer id;
    private String code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
