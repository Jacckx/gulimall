package com.jacckx.gulimall.member.feign;

import com.jacckx.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shaojun Chen
 * @version 1.0
 * @since 2022/2/8 0:24
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
