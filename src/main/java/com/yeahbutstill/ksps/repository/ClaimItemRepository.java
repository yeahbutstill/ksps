package com.yeahbutstill.ksps.repository;

import com.yeahbutstill.ksps.domain.dao.ClaimItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimItemRepository extends JpaRepository<ClaimItem, Long> {
}
