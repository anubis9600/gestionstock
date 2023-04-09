package tech.anubislab.gestionstock.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "role")
public class Role extends AbstractEntity {

    @Column(name = "rolename")
    private String roleName;

    @ManyToOne()
    @JoinColumn(name = "idutilisateur")
    private Utilisateur utilisateur;
}
