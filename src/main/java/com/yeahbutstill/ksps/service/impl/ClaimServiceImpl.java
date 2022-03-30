package com.yeahbutstill.ksps.service.impl;

import com.yeahbutstill.ksps.domain.dao.Claim;
import com.yeahbutstill.ksps.domain.dao.ClaimItem;
import com.yeahbutstill.ksps.domain.dto.ClaimResponseDTO;
import com.yeahbutstill.ksps.exception.ResourceNotFoundException;
import com.yeahbutstill.ksps.repository.ClaimItemRepository;
import com.yeahbutstill.ksps.repository.ClaimRepository;
import com.yeahbutstill.ksps.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private ClaimItemRepository claimItemRepository;

    @Override
    public ClaimResponseDTO findClaimById(Long id) {

        Claim claim = claimRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("invalid.claimId"));

        ClaimItem claimItem = claimItemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("invalid.claimItemId"));

        ClaimResponseDTO dtoClaim = new ClaimResponseDTO();
        dtoClaim.setMessage("Sukses");
        dtoClaim.setCode(HttpStatus.OK.value());
        dtoClaim.setData(Map.of(
                "claimNumber", claim.getClaimNumber(),
                "memberName", claim.getMember().getMemberName(),
                "statusClaim", claim.getStatuses().getStatus(),
                "item", Map.of(
                        "name", claimItem.getItemName(),
                        "value", claimItem.getValue()
                )
        ));

        return dtoClaim;

    }

    @Override
    public List<ClaimResponseDTO> findAll() {
        return null;
    }

}
