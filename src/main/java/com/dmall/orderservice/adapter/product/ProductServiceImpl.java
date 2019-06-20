package com.dmall.orderservice.adapter.product;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    private final ProductFeign productFeign;

    @Autowired
    public ProductServiceImpl(ProductFeign productFeign) {
        this.productFeign = productFeign;
    }

    @Override
    public String getProductName(Long productId) {
        return productFeign.getProductName(productId);

    }

    @Override
    @Hystrix
    public String getProductImage() {
        return new ProductImageGetterCommand().execute();
    }
}
