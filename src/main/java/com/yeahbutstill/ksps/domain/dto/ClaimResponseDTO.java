package com.yeahbutstill.ksps.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClaimResponseDTO {

    private Integer code;
    private String message;
    private Map<?, ?> data;

}
