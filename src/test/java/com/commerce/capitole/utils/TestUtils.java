package com.commerce.capitole.utils;

import com.commerce.capitole.constants.ProductPriceConstants;
import com.commerce.capitole.dto.ProductPriceResponse;
import com.commerce.capitole.entity.ProductPriceEntity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class TestUtils {
    public static ProductPriceEntity getProductPriceEntityTest1(){
        ProductPriceEntity productPriceEntity = new ProductPriceEntity();
        productPriceEntity.setPrice(35.5);
        productPriceEntity.setProductId(35455);
        productPriceEntity.setBrandId(1);
        productPriceEntity.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceEntity.setStartDate(LocalDateTime.parse("2020-06-14 00:00:00", formatter));
        productPriceEntity.setEndDate(LocalDateTime.parse("2020-12-31 23:59:59", formatter));
        return productPriceEntity;
    }

    public static ProductPriceResponse getProductPriceResponseTest1(){
        ProductPriceResponse productPriceResponse = new ProductPriceResponse();
        productPriceResponse.setPrice(35.5);
        productPriceResponse.setProductId(35455);
        productPriceResponse.setBrandId(1);
        productPriceResponse.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceResponse.setStartDate(LocalDateTime.parse("2020-06-14 00:00:00", formatter));
        productPriceResponse.setEndDate(LocalDateTime.parse("2020-12-31 23:59:59", formatter));
        return productPriceResponse;
    }

    public static ProductPriceEntity getProductPriceEntityTest2(){
        ProductPriceEntity productPriceEntity = new ProductPriceEntity();
        productPriceEntity.setPrice(25.45);
        productPriceEntity.setProductId(35455);
        productPriceEntity.setBrandId(1);
        productPriceEntity.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceEntity.setStartDate(LocalDateTime.parse("2020-06-14 15:00:00", formatter));
        productPriceEntity.setEndDate(LocalDateTime.parse("2020-06-14 18:30:00", formatter));
        return productPriceEntity;
    }

    public static ProductPriceResponse getProductPriceResponseTest2(){
        ProductPriceResponse productPriceResponse = new ProductPriceResponse();
        productPriceResponse.setPrice(25.45);
        productPriceResponse.setProductId(35455);
        productPriceResponse.setBrandId(1);
        productPriceResponse.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceResponse.setStartDate(LocalDateTime.parse("2020-06-14 15:00:00", formatter));
        productPriceResponse.setEndDate(LocalDateTime.parse("2020-06-14 18:30:00", formatter));
        return productPriceResponse;
    }

    public static ProductPriceEntity getProductPriceEntityTest3(){
        ProductPriceEntity productPriceEntity = new ProductPriceEntity();
        productPriceEntity.setPrice(35.5);
        productPriceEntity.setProductId(35455);
        productPriceEntity.setBrandId(1);
        productPriceEntity.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceEntity.setStartDate(LocalDateTime.parse("2020-06-14 00:00:00", formatter));
        productPriceEntity.setEndDate(LocalDateTime.parse("2020-12-31 23:59:59", formatter));
        return productPriceEntity;
    }

    public static ProductPriceResponse getProductPriceResponseTest3(){
        ProductPriceResponse productPriceResponse = new ProductPriceResponse();
        productPriceResponse.setPrice(35.5);
        productPriceResponse.setProductId(35455);
        productPriceResponse.setBrandId(1);
        productPriceResponse.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceResponse.setStartDate(LocalDateTime.parse("2020-06-14 00:00:00", formatter));
        productPriceResponse.setEndDate(LocalDateTime.parse("2020-12-31 23:59:59", formatter));
        return productPriceResponse;
    }

    public static ProductPriceEntity getProductPriceEntityTest4(){
        ProductPriceEntity productPriceEntity = new ProductPriceEntity();
        productPriceEntity.setPrice(30.5);
        productPriceEntity.setProductId(35455);
        productPriceEntity.setBrandId(1);
        productPriceEntity.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceEntity.setStartDate(LocalDateTime.parse("2020-06-15 00:00:00", formatter));
        productPriceEntity.setEndDate(LocalDateTime.parse("2020-06-15 11:00:00", formatter));
        return productPriceEntity;
    }

    public static ProductPriceResponse getProductPriceResponseTest4(){
        ProductPriceResponse productPriceResponse = new ProductPriceResponse();
        productPriceResponse.setPrice(30.5);
        productPriceResponse.setProductId(35455);
        productPriceResponse.setBrandId(1);
        productPriceResponse.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceResponse.setStartDate(LocalDateTime.parse("2020-06-15 00:00:00", formatter));
        productPriceResponse.setEndDate(LocalDateTime.parse("2020-06-15 11:00:00", formatter));
        return productPriceResponse;
    }

    public static ProductPriceEntity getProductPriceEntityTest5(){
        ProductPriceEntity productPriceEntity = new ProductPriceEntity();
        productPriceEntity.setPrice(38.95);
        productPriceEntity.setProductId(35455);
        productPriceEntity.setBrandId(1);
        productPriceEntity.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceEntity.setStartDate(LocalDateTime.parse("2020-06-15 16:00:00", formatter));
        productPriceEntity.setEndDate(LocalDateTime.parse("2020-12-31 23:59:59", formatter));
        return productPriceEntity;
    }

    public static ProductPriceResponse getProductPriceResponseTest5(){
        ProductPriceResponse productPriceResponse = new ProductPriceResponse();
        productPriceResponse.setPrice(38.95);
        productPriceResponse.setProductId(35455);
        productPriceResponse.setBrandId(1);
        productPriceResponse.setPriceList(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceResponse.setStartDate(LocalDateTime.parse("2020-06-15 16:00:00", formatter));
        productPriceResponse.setEndDate(LocalDateTime.parse("2020-12-31 23:59:59", formatter));
        return productPriceResponse;
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
