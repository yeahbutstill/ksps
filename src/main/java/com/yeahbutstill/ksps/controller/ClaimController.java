package com.yeahbutstill.ksps.controller;

import com.yeahbutstill.ksps.domain.dto.ClaimResponseDTO;
import com.yeahbutstill.ksps.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @GetMapping("/claim/get-all-data/{id}")
    public ResponseEntity<ClaimResponseDTO> findClaimById(@PathVariable Long id) {
        return ResponseEntity.ok().body(claimService.findClaimById(id));
    }

//    @PostMapping("/claim/register")
//    public ResponseEntity<Void> registerClaim(@RequestBody @Valid List<ClaimRegisterRequestDTO> dto) {
//        claimService.register(dto);
//        return ResponseEntity.created(URI.create("/author")).build();
//    }
//
//    @PostMapping("/claim/verify")
//    public ResponseEntity<Void> verifyClaim(@RequestBody @Valid List<ClaimVerifyRequestDTO> dto) {
//        claimService.verify(dto);
//        return ResponseEntity.created(URI.create("/author")).build();
//    }

}
