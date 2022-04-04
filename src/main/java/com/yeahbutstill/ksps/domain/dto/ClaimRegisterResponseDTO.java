package com.yeahbutstill.ksps.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClaimRegisterResponseDTO {

    private Integer code;
    private String message;
    private List<ClaimRegisterDataResponseDTO> data;

}
