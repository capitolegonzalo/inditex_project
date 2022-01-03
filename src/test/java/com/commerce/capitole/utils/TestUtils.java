package com.commerce.capitole.utils;

import com.commerce.capitole.constants.ProductPriceConstants;
import com.commerce.capitole.dto.ProductPriceResponse;
import com.commerce.capitole.entity.BrandEntity;
import com.commerce.capitole.entity.ProductPriceEntity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class TestUtils {
    public static ProductPriceEntity getProductPriceEntityTest1(){
        ProductPriceEntity productPriceEntity = new ProductPriceEntity();
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setId(1);
        productPriceEntity.setPrice(35.5);
        productPriceEntity.setProductId(35455);
        productPriceEntity.setBrand(brandEntity);
        productPriceEntity.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceEntity.setStartDate(LocalDateTime.parse("2020-06-14 00:00:00", formatter));
        productPriceEntity.setEndDate(LocalDateTime.parse("2020-12-31 23:59:59", formatter));
        return productPriceEntity;
    }

    public static ProductPriceEntity getProductPriceEntityTest2(){
        ProductPriceEntity productPriceEntity = new ProductPriceEntity();
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setId(1);
        productPriceEntity.setPrice(35.5);
        productPriceEntity.setProductId(35455);
        productPriceEntity.setBrand(brandEntity);
        productPriceEntity.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceEntity.setStartDate(LocalDateTime.parse("2020-06-14 15:00:00", formatter));
        productPriceEntity.setEndDate(LocalDateTime.parse("2020-06-14 18:30:00", formatter));
        return productPriceEntity;
    }

    public static ProductPriceEntity getProductPriceEntityTest3(){
        ProductPriceEntity productPriceEntity = new ProductPriceEntity();
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setId(1);
        productPriceEntity.setPrice(35.5);
        productPriceEntity.setProductId(35455);
        productPriceEntity.setBrand(brandEntity);
        productPriceEntity.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceEntity.setStartDate(LocalDateTime.parse("2020-06-14 00:00:00", formatter));
        productPriceEntity.setEndDate(LocalDateTime.parse("2020-12-31 23:59:59", formatter));
        return productPriceEntity;
    }

    public static ProductPriceEntity getProductPriceEntityTest4(){
        ProductPriceEntity productPriceEntity = new ProductPriceEntity();
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setId(1);
        productPriceEntity.setPrice(35.5);
        productPriceEntity.setProductId(35455);
        productPriceEntity.setBrand(brandEntity);
        productPriceEntity.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceEntity.setStartDate(LocalDateTime.parse("2020-06-15 00:00:00", formatter));
        productPriceEntity.setEndDate(LocalDateTime.parse("2020-06-15 11:00:00", formatter));
        return productPriceEntity;
    }

    public static ProductPriceEntity getProductPriceEntityTest5(){
        ProductPriceEntity productPriceEntity = new ProductPriceEntity();
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setId(1);
        productPriceEntity.setPrice(35.5);
        productPriceEntity.setProductId(35455);
        productPriceEntity.setBrand(brandEntity);
        productPriceEntity.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceEntity.setStartDate(LocalDateTime.parse("2020-06-15 16:00:00", formatter));
        productPriceEntity.setEndDate(LocalDateTime.parse("2020-12-31 23:59:59", formatter));
        return productPriceEntity;
    }

    public static ProductPriceResponse createResponse(LocalDateTime startDate, LocalDateTime endDate, Double price) {
        ProductPriceResponse response = new ProductPriceResponse();
        response.setBrandId(1);
        response.setProductId(35455);
        response.setPriceList(1);
        response.setStartDate(startDate);
        response.setEndDate(endDate);
        response.setPrice(price);
        return response;
    }
}
