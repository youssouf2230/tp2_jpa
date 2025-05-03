package net.youssouf.tp2.repository;

import net.youssouf.tp2.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryConsultation extends JpaRepository<Consultation, Long> {}
