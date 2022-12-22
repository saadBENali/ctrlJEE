package org.sid.ticketService.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ticketService.enums.Statut;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchResponseDTO {
    private String      id;
    private String reference;
    private String      lieu;
    private String   equipe1;
    private Date date;
    private String   equipe2;
}
