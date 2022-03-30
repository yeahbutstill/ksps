package com.yeahbutstill.ksps.repository;

import com.yeahbutstill.ksps.domain.dao.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {

}
