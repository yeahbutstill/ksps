package com.yeahbutstill.ksps.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClaimItemResponseDTO {

    private String name;
    private BigDecimal value;

}
