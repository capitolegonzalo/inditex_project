package com.commerce.capitole.controller;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.commerce.capitole.dto.ProductPriceResponse;
import com.commerce.capitole.service.ProductPriceService;
import com.commerce.capitole.utils.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest(classes = ProductPriceController.class)
@EnableWebMvc
@ActiveProfiles("test")
public class ProductPriceControllerTest {

	private static final String URL = "/price/product";

	private static final String BRAND_ID = "brandId";

	private static final String PRODUCT_ID = "productId";

	private static final String DATE = "date";

	private static final String PRICE_LIST = "priceList";

	private static final String PRICE = "price";
	
	@Autowired
	protected MockMvc mockMvc;
	
	@MockBean
	private ProductPriceService productPriceService;
	
	@BeforeEach
	void beforeEach() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void getProductPriceTest1() throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime startDate = LocalDateTime.parse("2020-06-14 00:00:00", formatter);
		LocalDateTime endDate = LocalDateTime.parse("2020-12-31 23:59:59", formatter);
		ProductPriceResponse response = TestUtils.createResponse(startDate, endDate,35.50);
		Mockito.when(productPriceService.getProductPrice(Mockito.any(), Mockito.any(), Mockito.any()))
		.thenReturn(response);
		
		mockMvc.perform(get(URL)
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.accept(MediaType.APPLICATION_JSON_VALUE)
				.param(BRAND_ID, "1")
				.param(PRODUCT_ID, "35455")
				.param(DATE, "2020-06-14 10:00:00"))
	        	.andExpect(status().isOk())
				.andExpect(jsonPath(PRODUCT_ID, equalTo((response.getProductId()))))
				.andExpect(jsonPath(BRAND_ID, equalTo((response.getBrandId()))))
	        	.andExpect(jsonPath(PRICE_LIST, equalTo((response.getPriceList()))))
	        	.andExpect(jsonPath(PRICE, equalTo((response.getPrice()))))
	        	.andDo(print());
	}

	@Test
	public void getProductPriceTest2() throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime startDate = LocalDateTime.parse("2020-06-14 15:00:00", formatter);
		LocalDateTime endDate = LocalDateTime.parse("2020-06-14 18:30:00", formatter);
		ProductPriceResponse response = TestUtils.createResponse(startDate, endDate,25.45);
		Mockito.when(productPriceService.getProductPrice(Mockito.any(), Mockito.any(), Mockito.any()))
		.thenReturn(response);
		
		mockMvc.perform(get(URL)
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.accept(MediaType.APPLICATION_JSON_VALUE)
				.param(BRAND_ID, "1")
				.param(PRODUCT_ID, "35455")
				.param(DATE, "2020-06-14 16:00:00"))
	        	.andExpect(status().isOk())
				.andExpect(jsonPath(PRODUCT_ID, equalTo((response.getProductId()))))
				.andExpect(jsonPath(BRAND_ID, equalTo((response.getBrandId()))))
	        	.andExpect(jsonPath(PRICE_LIST, equalTo((response.getPriceList()))))
				.andExpect(jsonPath(PRICE, equalTo((response.getPrice()))))
	        	.andDo(print());
	}
	
	@Test
	public void getProductPriceTest3() throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime startDate = LocalDateTime.parse("2020-06-14 00:00:00", formatter);
		LocalDateTime endDate = LocalDateTime.parse("2020-12-31 00:00:00", formatter);
		ProductPriceResponse response = TestUtils.createResponse(startDate, endDate, 35.50);
		Mockito.when(productPriceService.getProductPrice(Mockito.any(), Mockito.any(), Mockito.any()))
		.thenReturn(response);
		
		mockMvc.perform(get(URL)
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.accept(MediaType.APPLICATION_JSON_VALUE)
				.param(BRAND_ID, "1")
				.param(PRODUCT_ID, "35455")
				.param(DATE, "2020-06-14 21:00:00"))
	        	.andExpect(status().isOk())
				.andExpect(jsonPath(PRODUCT_ID, equalTo((response.getProductId()))))
				.andExpect(jsonPath(BRAND_ID, equalTo((response.getBrandId()))))
	        	.andExpect(jsonPath(PRICE_LIST, equalTo((response.getPriceList()))))
				.andExpect(jsonPath(PRICE, equalTo((response.getPrice()))))
	        	.andDo(print());
	}
	
	@Test
	public void getProductPriceTest4() throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime startDate = LocalDateTime.parse("2020-06-15 00:00:00", formatter);
		LocalDateTime endDate = LocalDateTime.parse("2020-06-15 11:00:00", formatter);
		ProductPriceResponse response = TestUtils.createResponse(startDate, endDate, 30.50);
		Mockito.when(productPriceService.getProductPrice(Mockito.any(), Mockito.any(), Mockito.any()))
		.thenReturn(response);
		
		mockMvc.perform(get(URL)
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.accept(MediaType.APPLICATION_JSON_VALUE)
				.param(BRAND_ID, "1")
				.param(PRODUCT_ID, "35455")
				.param(DATE, "2020-06-15 10:00:00"))
	        	.andExpect(status().isOk())
				.andExpect(jsonPath(PRODUCT_ID, equalTo((response.getProductId()))))
				.andExpect(jsonPath(BRAND_ID, equalTo((response.getBrandId()))))
	        	.andExpect(jsonPath(PRICE_LIST, equalTo((response.getPriceList()))))
				.andExpect(jsonPath(PRICE, equalTo((response.getPrice()))))
	        	.andDo(print());
	}
	
	@Test
	public void getProductPriceTest5() throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime startDate = LocalDateTime.parse("2020-06-15 16:00:00", formatter);
		LocalDateTime endDate = LocalDateTime.parse("2020-12-31 23:59:59", formatter);
		ProductPriceResponse response = TestUtils.createResponse(startDate, endDate, 38.95);
		Mockito.when(productPriceService.getProductPrice(Mockito.any(), Mockito.any(), Mockito.any()))
		.thenReturn(response);
		
		mockMvc.perform(get(URL)
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.accept(MediaType.APPLICATION_JSON_VALUE)
				.param(BRAND_ID, "1")
				.param(PRODUCT_ID, "35455")
				.param("date", "2020-06-16 21:00:00"))
	        	.andExpect(status().isOk())
	        	.andExpect(jsonPath(PRODUCT_ID, equalTo((response.getProductId()))))
	        	.andExpect(jsonPath(BRAND_ID, equalTo((response.getBrandId()))))
	        	.andExpect(jsonPath(PRICE_LIST, equalTo((response.getPriceList()))))
				.andExpect(jsonPath(PRICE, equalTo((response.getPrice()))))
	        	.andDo(print());
	}
	
}
