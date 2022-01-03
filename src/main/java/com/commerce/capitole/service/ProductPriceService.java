package com.commerce.capitole.service;

import com.commerce.capitole.dto.ProductPriceResponse;

public interface ProductPriceService {

    /**
     * Service that checks the price of the selected product
     *
     * @param brandId brand Id
     * @param productId product Id
     * @param date product price date
     */
    public ProductPriceResponse getProductPrice(Integer brandId, Integer productId, String date);

}
