package com.commerce.capitole.service.impl;

import com.commerce.capitole.dto.ProductPriceResponse;
import com.commerce.capitole.entity.ProductPriceEntity;
import com.commerce.capitole.repository.ProductPriceRepository;
import com.commerce.capitole.utils.TestUtils;
import com.commerce.capitole.validator.ProductPriceValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class ProductPriceServiceImplTest {

    @InjectMocks
    private ProductPriceServiceImpl productPriceService;

    @Mock
    private ProductPriceRepository productPriceRepository;

    @Mock
    private ProductPriceValidator productPriceValidator;

    @BeforeEach
    public void beforeEach() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test1(){
        List<ProductPriceEntity> productPriceEntityList = new ArrayList<>();
        productPriceEntityList.add(TestUtils.getProductPriceEntityTest1());
        Mockito.when(productPriceRepository.findByDateAndProductIdAndBrandId(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(productPriceEntityList);
        Mockito.doNothing().when(productPriceValidator).productPriceDateValidator(Mockito.any(),Mockito.any());
        ProductPriceResponse response = productPriceService.getProductPrice(1, 35455, "2020-06-14 10:00:00");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(productPriceEntityList.get(0).getPrice(), response.getPrice());
        Assertions.assertEquals(productPriceEntityList.get(0).getProductId(), response.getProductId());
        Assertions.assertEquals(productPriceEntityList.get(0).getBrandId(), response.getBrandId());
        Assertions.assertEquals(productPriceEntityList.get(0).getStartDate(), response.getStartDate());
        Assertions.assertEquals(productPriceEntityList.get(0).getEndDate(), response.getEndDate());
    }

    @Test
    public void test2(){
        List<ProductPriceEntity> productPriceEntityList = new ArrayList<>();
        productPriceEntityList.add(TestUtils.getProductPriceEntityTest2());
        Mockito.when(productPriceRepository.findByDateAndProductIdAndBrandId(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(productPriceEntityList);
        Mockito.doNothing().when(productPriceValidator).productPriceDateValidator(Mockito.any(),Mockito.any());
        ProductPriceResponse response = productPriceService.getProductPrice(1, 35455, "2020-06-14 16:00:00");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(productPriceEntityList.get(0).getPrice(), response.getPrice());
        Assertions.assertEquals(productPriceEntityList.get(0).getProductId(), response.getProductId());
        Assertions.assertEquals(productPriceEntityList.get(0).getBrandId(), response.getBrandId());
        Assertions.assertEquals(productPriceEntityList.get(0).getStartDate(), response.getStartDate());
        Assertions.assertEquals(productPriceEntityList.get(0).getEndDate(), response.getEndDate());
    }

    @Test
    public void test3(){
        List<ProductPriceEntity> productPriceEntityList = new ArrayList<>();
        productPriceEntityList.add(TestUtils.getProductPriceEntityTest3());
        Mockito.when(productPriceRepository.findByDateAndProductIdAndBrandId(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(productPriceEntityList);
        Mockito.doNothing().when(productPriceValidator).productPriceDateValidator(Mockito.any(),Mockito.any());
        ProductPriceResponse response = productPriceService.getProductPrice(1, 35455, "2020-06-14 21:00:00");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(productPriceEntityList.get(0).getPrice(), response.getPrice());
        Assertions.assertEquals(productPriceEntityList.get(0).getProductId(), response.getProductId());
        Assertions.assertEquals(productPriceEntityList.get(0).getBrandId(), response.getBrandId());
        Assertions.assertEquals(productPriceEntityList.get(0).getStartDate(), response.getStartDate());
        Assertions.assertEquals(productPriceEntityList.get(0).getEndDate(), response.getEndDate());
    }

    @Test
    public void test4(){
        List<ProductPriceEntity> productPriceEntityList = new ArrayList<>();
        productPriceEntityList.add(TestUtils.getProductPriceEntityTest4());
        Mockito.when(productPriceRepository.findByDateAndProductIdAndBrandId(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(productPriceEntityList);
        Mockito.doNothing().when(productPriceValidator).productPriceDateValidator(Mockito.any(),Mockito.any());
        ProductPriceResponse response = productPriceService.getProductPrice(1, 35455, "2020-06-15 10:00:00");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(productPriceEntityList.get(0).getPrice(), response.getPrice());
        Assertions.assertEquals(productPriceEntityList.get(0).getProductId(), response.getProductId());
        Assertions.assertEquals(productPriceEntityList.get(0).getBrandId(), response.getBrandId());
        Assertions.assertEquals(productPriceEntityList.get(0).getStartDate(), response.getStartDate());
        Assertions.assertEquals(productPriceEntityList.get(0).getEndDate(), response.getEndDate());
    }

    @Test
    public void test5(){
        List<ProductPriceEntity> productPriceEntityList = new ArrayList<>();
        productPriceEntityList.add(TestUtils.getProductPriceEntityTest5());
        Mockito.when(productPriceRepository.findByDateAndProductIdAndBrandId(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(productPriceEntityList);
        Mockito.doNothing().when(productPriceValidator).productPriceDateValidator(Mockito.any(),Mockito.any());
        ProductPriceResponse response = productPriceService.getProductPrice(1, 35455, "2020-06-16 21:00:00");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(productPriceEntityList.get(0).getPrice(), response.getPrice());
        Assertions.assertEquals(productPriceEntityList.get(0).getProductId(), response.getProductId());
        Assertions.assertEquals(productPriceEntityList.get(0).getBrandId(), response.getBrandId());
        Assertions.assertEquals(productPriceEntityList.get(0).getStartDate(), response.getStartDate());
        Assertions.assertEquals(productPriceEntityList.get(0).getEndDate(), response.getEndDate());
    }

}
