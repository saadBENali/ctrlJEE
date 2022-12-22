package org.sid.ticketService.web;

import org.sid.ticketService.DTO.TicketRequestDTO;
import org.sid.ticketService.DTO.TicketResponseDTO;
import org.sid.ticketService.entities.ticket;
import org.sid.ticketService.repositories.TicketRepository;
import org.sid.ticketService.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class TicketController {
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private TicketService ticketService;

    public TicketController(TicketRepository ticketRepository,TicketService ticketService) {
        this.ticketService= ticketService;
        this.ticketRepository = ticketRepository;
    }
    @QueryMapping
    public List<ticket> ticketsList(){
        return ticketRepository.findAll();
    }
    @QueryMapping
    public ticket ticketById(@Argument String id){
        return ticketRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Account %s not found",id)));
    }
//    @MutationMapping
//    private TicketResponseDTO ModificationStatut(@Argument String id, @Argument TicketRequestDTO ticket){
//        return ticketService.updateTicket(id,ticket);
//    }
@MutationMapping
private TicketResponseDTO AchatTicket(@Argument String id){
    return ticketService.updateTicket(id);
}
}
