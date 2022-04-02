package com.yeahbutstill.ksps.service;

import com.yeahbutstill.ksps.domain.dao.ClaimItem;
import com.yeahbutstill.ksps.domain.dto.ClaimItemResponseDTO;

import java.util.List;

public interface ClaimItemService {
    List<ClaimItemResponseDTO> constructDTO(List<ClaimItem> claimItems);
}
