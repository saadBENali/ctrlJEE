package org.sid.ticketService.service;

import org.sid.ticketService.DTO.MatchRequestDTO;
import org.sid.ticketService.DTO.MatchResponseDTO;

public interface matchService {
    public MatchResponseDTO addMatch(MatchRequestDTO matchDTO);
}
