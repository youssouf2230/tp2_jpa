package net.youssouf.tp2.repository;

import net.youssouf.tp2.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface RepositoryPatient extends JpaRepository<Patient, Long> {
    // Chercher des patients par leurs nom
    List<Patient> findByNomContains(String nom);

    // Chercher des patients par leurs dates de naissance
    List<Patient> findByDateNaissance(Date dateNaissance);
}
