package org.sid.ticketService.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ticketService.DTO.MatchRequestDTO;
import org.sid.ticketService.DTO.MatchResponseDTO;
import org.sid.ticketService.entities.match;
import org.sid.ticketService.repositories.MatchRepository;
import org.sid.ticketService.service.matchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MatchController {
    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private matchService matchService;

    public MatchController(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }
    @QueryMapping
    public List<match> matchslist(){
        return matchRepository.findAll();
    }
    @MutationMapping
    public MatchResponseDTO addMatch(@Argument MatchRequestDTO MATCH){
        System.out.println(MATCH.getEquipe2());
        return matchService.addMatch(MATCH);
    }
}
