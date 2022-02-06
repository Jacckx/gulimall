package com.jacckx.gulimall.product;

import com.jacckx.gulimall.product.entity.BrandEntity;
import com.jacckx.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;



    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("Huawei");

        brandService.save(brandEntity);
    }

}
