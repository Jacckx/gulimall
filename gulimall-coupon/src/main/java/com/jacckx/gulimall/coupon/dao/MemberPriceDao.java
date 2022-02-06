package com.jacckx.gulimall.coupon.dao;

import com.jacckx.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author Jack
 * @email jk.chen1104@gmail.com
 * @date 2022-02-05 22:52:22
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
