package com.yeahbutstill.ksps.domain.dto;

import lombok.Data;

import java.util.Map;

@Data
public class ClaimResponseDTO {

    private String code;
    private String message;
    private Map<?, ?> data;

}
