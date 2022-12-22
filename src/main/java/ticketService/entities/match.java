package org.sid.ticketService.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class match {
    @Id
    private String              id;
    @Column(unique=true)
    private String         reference;
    private Date date;
    private String              lieu;
    private String           equipe1;
    private String           equipe2;
    @OneToMany(mappedBy = "match")
    private List<ticket> ticketsList;
}
