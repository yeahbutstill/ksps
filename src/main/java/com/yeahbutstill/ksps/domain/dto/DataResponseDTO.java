package com.yeahbutstill.ksps.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataResponseDTO {

    private String claimNumber;
    private String memberName;
    private String statusClaim;
    private List<ClaimItemResponseDTO> item;

}
