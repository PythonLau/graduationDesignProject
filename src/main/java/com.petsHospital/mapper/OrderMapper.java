package com.petsHospital.mapper;

import com.petsHospital.domain.Order;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
public interface OrderMapper {
    Order selectOrderById(int id);
}
