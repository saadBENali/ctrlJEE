package org.sid.ticketService.mappers;

import org.sid.ticketService.DTO.MatchResponseDTO;
import org.sid.ticketService.entities.match;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MatchMapper {
    public static MatchResponseDTO fromMatch(match match) {
        MatchResponseDTO matchResponseDTO = new MatchResponseDTO();
        BeanUtils.copyProperties(match, matchResponseDTO);
        return matchResponseDTO;
    }
}
