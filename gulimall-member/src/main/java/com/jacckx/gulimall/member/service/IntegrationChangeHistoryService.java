package com.jacckx.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacckx.common.utils.PageUtils;
import com.jacckx.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author Jack
 * @email jk.chen1104@gmail.com
 * @date 2022-02-05 22:54:04
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

