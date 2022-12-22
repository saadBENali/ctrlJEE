package org.sid.ticketService.service;

import org.sid.ticketService.DTO.MatchRequestDTO;
import org.sid.ticketService.DTO.MatchResponseDTO;
import org.sid.ticketService.entities.match;
import org.sid.ticketService.entities.ticket;
import org.sid.ticketService.enums.Statut;
import org.sid.ticketService.mappers.MatchMapper;
import org.sid.ticketService.repositories.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;
@Service
@Transactional
public class matchServiceImpl implements matchService{
    @Autowired
    private MatchMapper matchMapper;
    @Autowired
    private MatchRepository matchRepository;
    @Override
    public MatchResponseDTO addMatch(MatchRequestDTO MatchDTO) {
        match m=match.builder().id(UUID.randomUUID().toString())
                .date(new Date())
                .reference(UUID.randomUUID().toString())
                .equipe2(MatchDTO.getEquipe2())
                .equipe1(MatchDTO.getEquipe1())
                .lieu(MatchDTO.getLieu())
                .build();
        match savematch=matchRepository.save(m);
        MatchResponseDTO matchResponseDTO = MatchMapper.fromMatch(savematch);
        return matchResponseDTO;
    }
}
