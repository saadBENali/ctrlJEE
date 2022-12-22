package org.sid.ticketService.repositories;

import org.sid.ticketService.entities.ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<ticket,String> {
}
