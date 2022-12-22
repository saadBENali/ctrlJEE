package org.sid.ticketService.mappers;

import org.sid.ticketService.DTO.MatchResponseDTO;
import org.sid.ticketService.DTO.TicketResponseDTO;
import org.sid.ticketService.entities.match;
import org.sid.ticketService.entities.ticket;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TicketMapper {
    public static TicketResponseDTO fromTicket(ticket ticket) {
        TicketResponseDTO ticketResponseDTO = new TicketResponseDTO();
        BeanUtils.copyProperties(ticket, ticketResponseDTO);
        return ticketResponseDTO;
    }
}
