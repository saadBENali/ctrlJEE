package org.sid.ticketService.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ticketService.enums.Statut;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class MatchRequestDTO {
    private String    lieu;
    private String equipe1;
    private String equipe2;
}
