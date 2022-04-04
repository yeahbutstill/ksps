package com.yeahbutstill.ksps.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClaimRegisterRequestDTO {

    private String cardNumber;
    private String hospitalName;
    private String admissionData;
    private List<ClaimItemResponseDTO> claimItem;

}
