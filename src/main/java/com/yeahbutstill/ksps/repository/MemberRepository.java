package com.yeahbutstill.ksps.repository;

import com.yeahbutstill.ksps.domain.dao.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
