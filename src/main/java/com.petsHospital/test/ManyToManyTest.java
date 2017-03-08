package com.petsHospital.test;

import com.petsHospital.domain.Article;
import com.petsHospital.domain.Order;
import com.petsHospital.domain.User;
import com.petsHospital.factory.FKSqlSessionFactory;
import com.petsHospital.mapper.OrderMapper;
import com.petsHospital.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
public class ManyToManyTest {
    public static void main(String[] args) throws Exception{
        SqlSession session = FKSqlSessionFactory.getSqlSession();
        ManyToManyTest t = new ManyToManyTest();
//        t.testSelectUserById(session);
        t.testSelectOrderById(session);
        session.commit();
        session.close();
    }
    public void testSelectUserById(SqlSession session){
        UserMapper um = session.getMapper(UserMapper.class);
        User user = um.selectUserById(1);
        System.out.println(user.getId() + " " + user.getUsername());
        List<Order> orders = user.getOrders();
        for(Order order:orders){
            System.out.println(order);
        }
    }
    public void testSelectOrderById(SqlSession session){
        OrderMapper om = session.getMapper(OrderMapper.class);
        Order order = om.selectOrderById(2);
        System.out.println(order.getId() + " " + order.getCode() + " " + order.getTotal());
        User user = order.getUser();
        System.out.println(user);
        List<Article> articles = order.getArticle();
        for(Article article : articles){
            System.out.println(article);
        }
    }
}
