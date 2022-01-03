package com.commerce.capitole.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name="PRICES")
@Data
public class ProductPriceEntity {

	@Column(name = "BRAND_ID")
	private Integer brandId;
	
	@Column(name = "START_DATE")
	private LocalDateTime startDate;
	
	@Column(name = "END_DATE")
	private LocalDateTime endDate;
	
	@Column(name = "PRICE_LIST")
	@Id
	private Integer priceList;
	
	@Column(name = "PRODUCT_ID")
	private Integer productId;
	
	@Column(name = "PRIORITY")
	private Integer priority;
	
	@Column(name = "PRICE")
	private Double price;
	
	@Column(name = "CURR")
	private String curr;

}
