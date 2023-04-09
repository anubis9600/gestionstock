package tech.anubislab.gestionstock.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import tech.anubislab.gestionstock.model.Adresse;
import tech.anubislab.gestionstock.model.CommandeClient;

import java.util.List;

public class ClientDto {

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String urlImage;

    private String mail;

    private String numTel;

    private List<CommandeClientDto> commandeClients;
}
