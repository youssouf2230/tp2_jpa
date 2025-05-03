package net.youssouf.tp2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private String statut;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Medecin medecin;

    @OneToOne(mappedBy = "rendezVous")
    private Consultation consultation;
}
