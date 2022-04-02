package com.yeahbutstill.ksps.service.impl;

import com.yeahbutstill.ksps.domain.dao.ClaimItem;
import com.yeahbutstill.ksps.domain.dto.ClaimItemResponseDTO;
import com.yeahbutstill.ksps.service.ClaimItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClaimItemServiceImpl implements ClaimItemService {
    @Override
    public List<ClaimItemResponseDTO> constructDTO(List<ClaimItem> claimItems) {
        return claimItems.stream().map((ClaimItem c) -> {
            ClaimItemResponseDTO dto = new ClaimItemResponseDTO();
            dto.setName(c.getItemName());
            dto.setValue(c.getValue());
            return dto;
        }).collect(Collectors.toList());
    }
}
