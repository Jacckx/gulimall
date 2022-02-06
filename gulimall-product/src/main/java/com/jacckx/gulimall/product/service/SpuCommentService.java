package com.jacckx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacckx.common.utils.PageUtils;
import com.jacckx.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author Jack
 * @email jk.chen1104@gmail.com
 * @date 2022-02-05 21:25:37
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

