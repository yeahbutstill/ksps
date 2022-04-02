package com.yeahbutstill.ksps.service;

import com.yeahbutstill.ksps.domain.dao.Member;
import com.yeahbutstill.ksps.domain.dto.MemberResponseDTO;

public interface MemberService {
    MemberResponseDTO constructDTO(Member member);
}
