package com.yeahbutstill.ksps.domain.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class ClaimResponseDTO {

    private String claimNumber;
    private String memberName;
    private String statusClaim;

}
