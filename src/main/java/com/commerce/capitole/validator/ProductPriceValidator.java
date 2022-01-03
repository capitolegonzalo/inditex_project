package com.commerce.capitole.validator;

import java.time.format.DateTimeFormatter;

public interface ProductPriceValidator {

    /**
     * Product price date validation
     *
     * @param date product price date
     * @param formatter date format
     */
    public void productPriceDateValidator(String date, DateTimeFormatter formatter);

}
