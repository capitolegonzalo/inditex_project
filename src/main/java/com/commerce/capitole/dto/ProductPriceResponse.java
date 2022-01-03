package com.commerce.capitole.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.commerce.capitole.constants.ProductPriceConstants;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductPriceResponse implements Serializable {
	
	private static final long serialVersionUID = 3353202643948398362L;

	@JsonProperty("productId")
	private Integer productId = null;

	@JsonProperty("brandId")
	private Integer brandId = null;

	@JsonProperty("priceList")
	private Integer priceList = null;

	@JsonProperty("startDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = ProductPriceConstants.DATE_FORMAT)
	private LocalDateTime startDate = null;

	@JsonProperty("endDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime endDate = null;

	@JsonProperty("price")
	private Double price = null;
	
}
