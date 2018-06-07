package com.inetpsa.pct01.pmtapplication.repository;

import com.inetpsa.pct01.pmtapplication.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
