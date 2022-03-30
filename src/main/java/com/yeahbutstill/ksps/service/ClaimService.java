package com.yeahbutstill.ksps.service;

import com.yeahbutstill.ksps.domain.dto.ClaimResponseDTO;

import java.util.List;

public interface ClaimService {

    ClaimResponseDTO findClaimById(Long id);

    List<ClaimResponseDTO> list();

}
