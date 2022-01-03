package com.commerce.capitole.mapper.impl;

import com.commerce.capitole.dto.ProductPriceResponse;
import com.commerce.capitole.entity.ProductPriceEntity;
import com.commerce.capitole.mapper.ProductPriceResponeMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductPriceResponeMapperImpl implements ProductPriceResponeMapper {

    public ProductPriceResponse toDTO(ProductPriceEntity source){
        ProductPriceResponse response = new ProductPriceResponse();
        response.setProductId(source.getProductId());
        response.setBrandId(source.getBrandId());
        response.setPriceList(source.getPriceList());
        response.setStartDate(source.getStartDate());
        response.setEndDate(source.getEndDate());
        response.setPrice(source.getPrice());
        return response;
    }
}
