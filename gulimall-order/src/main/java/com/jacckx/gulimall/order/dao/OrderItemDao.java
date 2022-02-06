package com.jacckx.gulimall.order.dao;

import com.jacckx.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Jack
 * @email jk.chen1104@gmail.com
 * @date 2022-02-05 22:55:21
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
