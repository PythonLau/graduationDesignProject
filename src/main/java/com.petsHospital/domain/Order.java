package com.petsHospital.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
public class Order implements Serializable{
    private Integer id;
    private String code;
    private Double total;
    private User user;
    private List<Article> article;

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

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Article> getArticle() {
        return article;
    }

    public void setArticle(List<Article> article) {
        this.article = article;
    }
}
