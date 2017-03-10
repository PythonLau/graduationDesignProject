package com.petsHospital.test;

import com.petsHospital.domain.Article;
import com.petsHospital.domain.Order;
import com.petsHospital.factory.FKSqlSessionFactory;
import com.petsHospital.mapper.OrderMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
public class ManyToMany {
    public static void main(String[] args) throws Exception{
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        OrderMapper om = session.getMapper(OrderMapper.class);
        Order order = om.selectById(1);
        System.out.println(order.getId() + " " + order.getCode() + " " + order.getTotal());
        System.out.println(order.getUser());
        List<Article> articles = order.getArticles();
        for(Article article : articles){
            System.out.println(article.getName());
        }
        session.commit();
        session.close();
    }
}
