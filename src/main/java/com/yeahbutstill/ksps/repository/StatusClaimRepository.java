package com.yeahbutstill.ksps.repository;

import com.yeahbutstill.ksps.domain.dao.StatusClaim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusClaimRepository extends JpaRepository<StatusClaim, Long> {
}
