package com.yeahbutstill.ksps.service.impl;

import com.yeahbutstill.ksps.domain.dao.Claim;
import com.yeahbutstill.ksps.domain.dto.ClaimResponseDTO;
import com.yeahbutstill.ksps.exception.ResourceNotFoundException;
import com.yeahbutstill.ksps.repository.ClaimRepository;
import com.yeahbutstill.ksps.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public ClaimResponseDTO findClaimById(Long id) {
        Claim claim = claimRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("invalid.authorId"));
        // 2. author -> authorResponseDTO
        ClaimResponseDTO dto = new ClaimResponseDTO();
        dto.setClaimNumber(claim.getClaimNumber());
        dto.setMemberName(claim.getMember().getMemberName());
        dto.setStatusClaim(claim.getStatuses().getStatus());
        return dto;
    }

    @Override
    public List<ClaimResponseDTO> list() {
        return null;
    }
}
