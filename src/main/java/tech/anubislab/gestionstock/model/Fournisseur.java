package tech.anubislab.gestionstock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "fournisseur")
public class Fournisseur extends AbstractEntity {

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Embedded
    private Adresse adresse;

    @Column(name = "urlimage")
    private String urlImage;

    @Column(name = "mail")
    private String mail;

    @Column(name = "numtel")
    private String numTel;

    @OneToMany(mappedBy = "fournisseur")
    private List<CommandeFournisseur> commandeFournisseurs;

}
