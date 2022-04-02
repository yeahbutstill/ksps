package com.yeahbutstill.ksps.service.impl;

import com.yeahbutstill.ksps.domain.dao.Claim;
import com.yeahbutstill.ksps.domain.dto.ClaimResponseDTO;
import com.yeahbutstill.ksps.exception.ResourceNotFoundException;
import com.yeahbutstill.ksps.repository.ClaimItemRepository;
import com.yeahbutstill.ksps.repository.ClaimRepository;
import com.yeahbutstill.ksps.service.ClaimItemService;
import com.yeahbutstill.ksps.service.ClaimService;
import com.yeahbutstill.ksps.service.MemberService;
import com.yeahbutstill.ksps.service.StatusClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private ClaimItemRepository claimItemRepository;

    @Autowired
    private ClaimItemService claimItemService;

    @Autowired
    private MemberService memberService;

    @Autowired
    private StatusClaimService statusClaimService;

    @Override
    public ClaimResponseDTO findClaimById(Long id) {
        Claim claim = claimRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("invalid.claimId"));
        ClaimResponseDTO claimResponseDTO = new ClaimResponseDTO();
        claimResponseDTO.setCode(String.valueOf(HttpStatus.OK.value()));
        claimResponseDTO.setMessage("Sukses");
        claimResponseDTO.setData(Map.of(
                "claimNumber", claim.getClaimNumber(),
                "memberName", claim.getMembers().getMemberName(),
                "statusClaim", claim.getStatusClaims().getStatus(),
                "item", claimItemService.constructDTO(claim.getClaimItems())
        ));
        return claimResponseDTO;
    }

}
