package com.commerce.capitole.controller;


import com.commerce.capitole.dto.ProductPriceResponse;
import com.commerce.capitole.service.ProductPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductPriceController {

	private final ProductPriceService productPriceService;
	
	@GetMapping("/price/product")
	public ResponseEntity<ProductPriceResponse> getProductPrice(@RequestParam("brandId") Integer brandId,
																@RequestParam("productId") Integer productId,
																@RequestParam("date") String date){
		return ResponseEntity.status(HttpStatus.OK).body(productPriceService.getProductPrice(brandId, productId, date));
	}

}
