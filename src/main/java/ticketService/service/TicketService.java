package org.sid.ticketService.service;

import org.sid.ticketService.DTO.MatchRequestDTO;
import org.sid.ticketService.DTO.MatchResponseDTO;
import org.sid.ticketService.DTO.TicketRequestDTO;
import org.sid.ticketService.DTO.TicketResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface TicketService {
    public TicketResponseDTO updateTicket(String id);
}
