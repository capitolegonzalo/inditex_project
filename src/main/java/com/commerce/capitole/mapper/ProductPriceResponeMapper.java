package com.commerce.capitole.mapper;

import com.commerce.capitole.dto.ProductPriceResponse;
import org.mapstruct.Mapper;

import com.commerce.capitole.entity.ProductPriceEntity;
import org.mapstruct.Mapping;

@Mapper
public interface ProductPriceResponeMapper {

	@Mapping(target = "brandId", source="brand.id")
	ProductPriceResponse toDTO(ProductPriceEntity source);

}
