package com.yeahbutstill.ksps.repository;

import com.yeahbutstill.ksps.domain.dao.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {

}
