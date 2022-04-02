package com.yeahbutstill.ksps.service;

import com.yeahbutstill.ksps.domain.dao.StatusClaim;
import com.yeahbutstill.ksps.domain.dto.StatusClaimResponseDTO;

public interface StatusClaimService {
    StatusClaimResponseDTO constructDTO(StatusClaim statusClaim);

}
