package org.sid.ticketService.service;

import org.sid.ticketService.DTO.TicketRequestDTO;
import org.sid.ticketService.DTO.TicketResponseDTO;
import org.sid.ticketService.entities.ticket;
import org.sid.ticketService.enums.Statut;
import org.sid.ticketService.mappers.TicketMapper;
import org.sid.ticketService.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TicketServiceImpl implements TicketService{
    @Autowired
   private TicketRepository ticketRepository;
    @Override
    public TicketResponseDTO updateTicket(String id) {
        ticket ticketById =  ticketRepository.findById(id).get();
        if(ticketById != null && ticketById.getStatut()== Statut.ACTIVER){
            ticketById.setStatut(Statut.DESACTIVER);
            return TicketMapper.fromTicket(ticketById);
        }
        return null;
    }
}
