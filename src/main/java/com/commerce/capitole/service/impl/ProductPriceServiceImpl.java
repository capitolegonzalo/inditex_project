package com.commerce.capitole.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.commerce.capitole.constants.ProductPriceConstants;
import com.commerce.capitole.entity.ProductPriceEntity;
import com.commerce.capitole.dto.ProductPriceResponse;
import com.commerce.capitole.mapper.ProductPriceResponeMapper;
import com.commerce.capitole.repository.ProductPriceRepository;
import com.commerce.capitole.service.ProductPriceService;
import com.commerce.capitole.validator.ProductPriceValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductPriceServiceImpl implements ProductPriceService {

    private final ProductPriceRepository productPriceRepository;

    private final ProductPriceValidator productPriceValidator;

    /**
     * Service that checks the price of the selected product
     *
     * @param brandId brand Id
     * @param productId product Id
     * @param date product price date
     */
    public ProductPriceResponse getProductPrice(Integer brandId, Integer productId, String date) {
        log.info("Start - Get product price service");
        log.info("Validating the date of the product price");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(ProductPriceConstants.DATE_FORMAT);
        productPriceValidator.productPriceDateValidator(date, formatter);
        log.info("Correct validation");
        ProductPriceResponse response = new ProductPriceResponse();
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        final ProductPriceResponeMapper productPriceResponeMapper = Mappers.getMapper(ProductPriceResponeMapper.class);
        List<ProductPriceEntity> productPrices = productPriceRepository.findByDateAndProductIdAndBrandId(brandId, productId, dateTime);
        if (!productPrices.isEmpty()) {
            log.info("Product found successfully");
            response = productPriceResponeMapper.toDTO(productPrices.get(0));
        }
        log.info("End - Get product price service");
        return response;
    }

}
