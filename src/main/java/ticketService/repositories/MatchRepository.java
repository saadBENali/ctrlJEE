package org.sid.ticketService.repositories;

import org.sid.ticketService.entities.match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<match,String> {
    match findByReference(String reference);
}
