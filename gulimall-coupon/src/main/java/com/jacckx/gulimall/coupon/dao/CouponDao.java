package com.jacckx.gulimall.coupon.dao;

import com.jacckx.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Jack
 * @email jk.chen1104@gmail.com
 * @date 2022-02-05 22:52:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
