package com.jacckx.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jacckx.common.utils.PageUtils;
import com.jacckx.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Jack
 * @email jk.chen1104@gmail.com
 * @date 2022-02-05 22:54:04
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

