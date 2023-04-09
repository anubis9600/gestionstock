package tech.anubislab.gestionstock.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import tech.anubislab.gestionstock.model.Client;
import tech.anubislab.gestionstock.model.LigneCommandeClient;

import java.time.Instant;
import java.util.List;

public class CommandeClientDto {

    private String code;

    private Instant dateCommande;

    private ClientDto client;

    private List<LigneCommandeClientDto> ligneCommandeClients;
}
