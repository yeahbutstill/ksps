package com.yeahbutstill.ksps.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusClaimResponseDTO {
    private String status;
}
