package com.yeahbutstill.ksps.service.impl;

import com.yeahbutstill.ksps.domain.dao.Member;
import com.yeahbutstill.ksps.domain.dto.MemberResponseDTO;
import com.yeahbutstill.ksps.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Override
    public MemberResponseDTO constructDTO(Member member) {
        MemberResponseDTO dto = new MemberResponseDTO();
        dto.setMemberName(member.getMemberName());
        return dto;
    }

}
