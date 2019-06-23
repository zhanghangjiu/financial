package com.imooc.manager.service;
import com.imooc.entity.Product;
import com.imooc.entity.enums.ProductStatus;
import com.imooc.manager.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.xml.transform.Result;
import java.math.BigDecimal;
import java.util.Date;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    private static  final Logger  LOG  = LoggerFactory.getLogger(ProductService.class);
    public Product addProduct(Product product) {
        LOG.debug("创建产品,参数:{}", product);
       //校验数据
        Assert.notNull(product.getId(),"编号不可为空");
        Assert.notNull(product.getName(),"产品名称不可为空");
        product.setCreateAt(new Date());
        product.setUpdateAt(new Date());
        if (product.getLockTerm()==null){
            product.setLockTerm(0);
        }
        if (product.getRewardRate()==null){
            product.setRewardRate(BigDecimal.valueOf(20));
        }
        if (product.getStepAmount()==null){
            product.setStepAmount(BigDecimal.valueOf(20));
        }
        if (product.getThresholdAmoount()==null){
            product.setThresholdAmoount(BigDecimal.valueOf(20));
        }

        product.setStatus(ProductStatus.A0UDINTING.name());
        Product result = productRepository.save(product);
        LOG.debug("创建产品,结果:{}",result);
        return result;

    }


    public Product queryProductById(String id) {
        Product one = productRepository.getOne(id);
        return  one;
    }
}
