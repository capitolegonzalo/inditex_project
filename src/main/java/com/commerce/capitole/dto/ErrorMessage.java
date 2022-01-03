package com.commerce.capitole.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorMessage implements Serializable {

    private static final long serialVersionUID = -8386474668793480463L;

    @JsonProperty("field")
    private String field = null;

    @JsonProperty("value")
    private String value = null;

    @JsonProperty("description")
    private String description = null;
}
