package org.sid.ticketService.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ticketService.entities.match;
import org.sid.ticketService.enums.Statut;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketRequestDTO {
    private Float prix;
    private Statut statut;
    private org.sid.ticketService.entities.match match;
}
