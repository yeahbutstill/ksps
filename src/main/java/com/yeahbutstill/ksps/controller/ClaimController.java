package com.yeahbutstill.ksps.controller;

import com.yeahbutstill.ksps.domain.dto.ClaimRegisterRequestDTO;
import com.yeahbutstill.ksps.domain.dto.ClaimRegisterResponseDTO;
import com.yeahbutstill.ksps.domain.dto.ClaimResponseDTO;
import com.yeahbutstill.ksps.service.impl.ClaimServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/claim")
public class ClaimController {

    @Autowired
    private ClaimServiceImpl claimService;

    @PostMapping("/register")
    public ResponseEntity<ClaimRegisterResponseDTO> saveClaim(@RequestBody List<ClaimRegisterRequestDTO> dtos) {
        return ResponseEntity.ok(
                ClaimRegisterResponseDTO.builder()
                        .code(HttpStatus.OK.value())
                        .message("Sukses")
                        .data(claimService.claimRegister(dtos))
                        .build()
        );
    }

    @GetMapping("/get-all-data")
    public ResponseEntity<ClaimResponseDTO> getClaims() {
        return ResponseEntity.ok(
                ClaimResponseDTO.builder()
                        .code(HttpStatus.OK.value())
                        .message("Sukses")
                        .data(claimService.claimList())
                        .build()
        );
    }

}
