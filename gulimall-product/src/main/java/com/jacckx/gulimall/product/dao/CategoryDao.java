package com.jacckx.gulimall.product.dao;

import com.jacckx.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Jack
 * @email jk.chen1104@gmail.com
 * @date 2022-02-05 21:25:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}