package com.commerce.capitole.mapper;

import com.commerce.capitole.dto.ProductPriceResponse;
import org.mapstruct.Mapper;

import com.commerce.capitole.entity.ProductPriceEntity;

@Mapper
public interface ProductPriceResponeMapper {

	ProductPriceResponse toDTO(ProductPriceEntity source);

}
