package com.yeahbutstill.ksps.repository;

import com.yeahbutstill.ksps.domain.dao.Statuses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatuesesRepository extends JpaRepository<Statuses, Long> {
}
