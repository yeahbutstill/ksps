package com.yeahbutstill.ksps.service.impl;

import com.yeahbutstill.ksps.domain.dao.Claim;
import com.yeahbutstill.ksps.domain.dto.ClaimDataResponseDTO;
import com.yeahbutstill.ksps.domain.dto.ClaimRegisterDataResponseDTO;
import com.yeahbutstill.ksps.domain.dto.ClaimRegisterRequestDTO;
import com.yeahbutstill.ksps.repository.ClaimItemRepository;
import com.yeahbutstill.ksps.repository.ClaimRepository;
import com.yeahbutstill.ksps.service.ClaimService;
import com.yeahbutstill.ksps.service.MemberService;
import com.yeahbutstill.ksps.service.StatusClaimService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ClaimServiceImpl implements ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private ClaimItemRepository claimItemRepository;

    @Autowired
    private ClaimItemServiceImpl claimItemService;

    @Autowired
    private MemberService memberService;

    @Autowired
    private StatusClaimService statusClaimService;

    @Override
    public List<ClaimDataResponseDTO> claimList() {
        List<Claim> claims = claimRepository.findAll();
        return claims.stream().map(claim -> {
            ClaimDataResponseDTO dto = new ClaimDataResponseDTO();
            dto.setClaimNumber(claim.getClaimNumber());
            dto.setMemberName(claim.getMembers().getMemberName());
            dto.setStatusClaim(claim.getStatusClaims().getStatus());
            dto.setItem(claimItemService.constructDTO(claim.getClaimItems()));
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public List<ClaimRegisterDataResponseDTO> claimRegister(List<ClaimRegisterRequestDTO> dtos) {
        List<Claim> claims = claimRepository.findAll();
        return claims.stream().map(claim -> {
            ClaimRegisterDataResponseDTO dto = new ClaimRegisterDataResponseDTO();
            dto.setClaimNumber("C0001");
            return dto;
        }).collect(Collectors.toList());
    }


//    @Override
//    public ClaimResponseDTO findClaimById(Long id) {
//        Claim claim = claimRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("invalid.claimId"));
//        ClaimResponseDTO claimResponseDTO = new ClaimResponseDTO();
//        claimResponseDTO.setCode(String.valueOf(HttpStatus.OK.value()));
//        claimResponseDTO.setMessage("Sukses");
//        claimResponseDTO.setData(Map.of(
//                "claimNumber", claim.getClaimNumber(),
//                "memberName", claim.getMembers().getMemberName(),
//                "statusClaim", claim.getStatusClaims().getStatus(),
//                "item", claimItemService.constructDTO(claim.getClaimItems())
//        ));
//        return claimResponseDTO;
//    }

}
