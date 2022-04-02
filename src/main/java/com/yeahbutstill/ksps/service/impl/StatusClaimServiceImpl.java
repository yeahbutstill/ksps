package com.yeahbutstill.ksps.service.impl;

import com.yeahbutstill.ksps.domain.dao.StatusClaim;
import com.yeahbutstill.ksps.domain.dto.StatusClaimResponseDTO;
import com.yeahbutstill.ksps.service.StatusClaimService;
import org.springframework.stereotype.Service;

@Service
public class StatusClaimServiceImpl implements StatusClaimService {

    @Override
    public StatusClaimResponseDTO constructDTO(StatusClaim statusClaim) {
        StatusClaimResponseDTO dto = new StatusClaimResponseDTO();
        dto.setStatus(statusClaim.getStatus());
        return dto;
    }

}
