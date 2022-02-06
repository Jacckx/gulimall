package com.jacckx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacckx.common.utils.PageUtils;
import com.jacckx.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author Jack
 * @email jk.chen1104@gmail.com
 * @date 2022-02-05 21:25:37
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

