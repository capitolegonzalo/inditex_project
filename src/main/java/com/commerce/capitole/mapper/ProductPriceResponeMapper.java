package com.commerce.capitole.mapper;

import com.commerce.capitole.dto.ProductPriceResponse;
import com.commerce.capitole.entity.ProductPriceEntity;

public interface ProductPriceResponeMapper {

	public ProductPriceResponse toDTO(ProductPriceEntity source);

}
