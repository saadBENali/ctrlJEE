package org.sid.ticketService.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ticketService.enums.Statut;


@Entity
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class ticket {
    @Id
    private String id;
    @Column(unique=true)
    private String reference;
    private Float prix;
    @Enumerated(EnumType.STRING)
    private Statut statut=Statut.ACTIVER;
    @ManyToOne
    private match match;
}
