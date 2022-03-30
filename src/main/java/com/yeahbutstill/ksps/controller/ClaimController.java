package com.yeahbutstill.ksps.controller;

import com.yeahbutstill.ksps.domain.dto.ClaimResponseDTO;
import com.yeahbutstill.ksps.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/claim")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @GetMapping("/get-all-data/{id}")
    public ResponseEntity<ClaimResponseDTO> findClaimById(@PathVariable Long id) {
        return ResponseEntity.ok().body(claimService.findClaimById(id));
    }

}
