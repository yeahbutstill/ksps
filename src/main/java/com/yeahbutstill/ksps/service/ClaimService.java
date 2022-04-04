package com.yeahbutstill.ksps.service;

import com.yeahbutstill.ksps.domain.dto.ClaimDataResponseDTO;
import com.yeahbutstill.ksps.domain.dto.ClaimRegisterDataResponseDTO;
import com.yeahbutstill.ksps.domain.dto.ClaimRegisterRequestDTO;

import java.util.List;

public interface ClaimService {

    List<ClaimDataResponseDTO> claimList();

    List<ClaimRegisterDataResponseDTO> claimRegister(List<ClaimRegisterRequestDTO> dtos);

//    ClaimResponseDTO findClaimById(Long id);

}
