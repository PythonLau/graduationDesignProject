package com.petsHospital.mapper;

import com.petsHospital.domain.Article;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
public interface ArticleMapper {
    Article selectArticleByOrderId(int id);
}
