package com.petsHospital.mapper;

import com.petsHospital.domain.Article;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
public interface ArticleMapper {
    @Select("select * from tb_article where id in (select article_id from tb_item where order_id = #{id})")
    List<Article> selectByOrderId(Integer order_id);
}
