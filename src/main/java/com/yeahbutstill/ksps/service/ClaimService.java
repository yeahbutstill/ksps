package com.yeahbutstill.ksps.service;

import com.yeahbutstill.ksps.domain.dto.ClaimResponseDTO;

public interface ClaimService {

    ClaimResponseDTO findClaimById(Long id);

}
