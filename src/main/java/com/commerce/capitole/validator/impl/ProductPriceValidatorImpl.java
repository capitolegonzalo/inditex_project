package com.commerce.capitole.validator.impl;

import com.commerce.capitole.util.MessageCodes;
import com.commerce.capitole.validator.ProductPriceValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductPriceValidatorImpl implements ProductPriceValidator {

    private final MessageSource messageSource;

    /**
     * Product price date validation
     *
     * @param date product price date
     * @param formatter date format
     */
    public void productPriceDateValidator(String date, DateTimeFormatter formatter) {
        try {
            LocalDateTime.parse(date, formatter);
        } catch (DateTimeParseException e) {
            String message = messageSource.getMessage(MessageCodes.ERROR_PARSE_DATE_FORMAT, null, Locale.getDefault());
            log.error(message);
            throw new DateTimeParseException(message, e.getParsedString(), e.getErrorIndex());
        }
    }

}
