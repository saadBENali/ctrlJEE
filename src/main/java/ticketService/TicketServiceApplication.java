package org.sid.ticketService;

import org.sid.ticketService.entities.match;
import org.sid.ticketService.entities.ticket;
import org.sid.ticketService.enums.Statut;
import org.sid.ticketService.repositories.MatchRepository;
import org.sid.ticketService.repositories.TicketRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class TicketServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(MatchRepository matchRepository,TicketRepository ticketRepository){
		return args->{
			for(long i=1; i<7; i++){
				match m =match.builder().id(UUID.randomUUID().toString())
						.reference(UUID.randomUUID().toString())
						.equipe2("FCB")
						.equipe1("RMA")
						.lieu("Barcelona")
						.date(new Date())
						.build();
				matchRepository.save(m);
			}
			matchRepository.findAll().forEach(match -> {
				for(int i=1; i<=10; i++){
					ticket tick = ticket.builder()
							.id(UUID.randomUUID().toString())
							.prix(200F)
							.match(match)
							.reference(UUID.randomUUID().toString())
							.statut(Statut.ACTIVER)
							.build();
					ticketRepository.save(tick);
				}});
		};
	}

}
