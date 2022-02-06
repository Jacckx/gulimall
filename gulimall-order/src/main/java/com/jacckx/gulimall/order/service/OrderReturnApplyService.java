package com.jacckx.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacckx.common.utils.PageUtils;
import com.jacckx.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author Jack
 * @email jk.chen1104@gmail.com
 * @date 2022-02-05 22:55:21
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

